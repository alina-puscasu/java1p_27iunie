import java.util.concurrent.*;

public class Exemplu8 {
    /*
       
     
       
        Semaphore
        ReentrantReadWriteLock
        CyclicBarrier
        
       */
    public static void main(String [] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        service.execute(new MyRunnable1());
    }
}