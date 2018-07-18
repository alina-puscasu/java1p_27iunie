public class Exemplu12 {
    public static void main(String [] args) {
        
        
        
        new Thread(() -> {
                for(int i = 1; i < 20; i += 2) {
                    System.out.println(i);
                    try {
                        Thread.sleep(500);
                    }catch(Exception e) {
                        e.printStackTrace();
                    }
                }
        }).start();
    }
}