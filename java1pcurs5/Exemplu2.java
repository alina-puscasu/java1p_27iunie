import java.util.concurrent.*;

public class Exemplu2 {
    /*
       Callable<T>
       
       public T call() throws Exception;
       
       */
    
    public static void main(String []args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        Future<String> result = service.submit( () -> {
                                return "hello world";
                            });
        
        //procesari...
        
        
        try {
            String message = result.get();
            System.out.println("message = " + message);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        } finally {
            service.shutdown();
        }            
                            
    }
}