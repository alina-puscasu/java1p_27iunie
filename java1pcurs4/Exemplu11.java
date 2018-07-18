public class Exemplu11 {
    public static void main(String [] args) {
        System.out.println("main begins...");
        
        
        EvenNumbersThread t = new EvenNumbersThread();
        t.start();
        
        try {
            Thread.sleep(1000);
        }catch(Exception e) {
            e.printStackTrace();
        }
        
        System.out.println("main finishes...");
    }
}