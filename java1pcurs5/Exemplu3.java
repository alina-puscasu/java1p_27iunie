import java.util.concurrent.*;
import java.util.*;

public class Exemplu3 {
    public static void main(String [] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        SumCallable callable = new SumCallable(list);
        
        ExecutorService service = Executors.newSingleThreadExecutor();
        Future<Integer> result = service.submit(callable);
        
        try {
            Integer suma = result.get();
            System.out.println("suma = " + suma);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        } finally {
            service.shutdown();
        }
    }
}