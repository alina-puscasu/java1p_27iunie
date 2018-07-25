import java.util.concurrent.*;

public class Exemplu9 {
    public static void main(String [] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        service.execute(new MyRunnable2());
    }
}