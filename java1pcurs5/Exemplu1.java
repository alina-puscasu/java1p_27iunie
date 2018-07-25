import java.util.concurrent.*;

public class Exemplu1 {
    /*
       java.util.concurrent
       
       Executor
       ExecutorService
       ScheduledExecutorService
       Executors
    */
    
    public static void main(String [] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        service.execute( () -> {
                    for(int i = 1; i <= 20; i += 2) {
                        System.out.println(i);
                    }
        } );
        
        service.shutdown();
        
        
        
        
        
        
    }
}