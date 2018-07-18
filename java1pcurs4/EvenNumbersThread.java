public class EvenNumbersThread extends Thread {
    @Override
    public void run() {
        
        for(int i = 0; i < 20; i += 2) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            }catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}