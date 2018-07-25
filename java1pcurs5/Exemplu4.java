import java.util.concurrent.*;
import java.util.*;

public class Exemplu4 {
    
    public static void main(String [] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        List<Integer> list1 = Arrays.asList(1, 3, 5, 7);
        List<Integer> list2 = Arrays.asList(10, 30, 50, 70);
        List<Integer> list3 = Arrays.asList(2, 4, 6, 8);
        
        Future<Integer> res1 = service.submit(new SumCallable(list1));
        Future<Integer> res2 = service.submit(new SumCallable(list2));
        Future<Integer> res3 = service.submit(new SumCallable(list3));
        
        try {
            System.out.println("suma1 = " + res1.get());
            System.out.println("suma2 = " + res2.get());
            System.out.println("suma3 = " + res3.get());
        }catch(Exception e) {
        
        }finally {
            service.shutdown();
        }
    }
}