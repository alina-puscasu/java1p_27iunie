import java.io.*;

public class Exemplu2 {
    
    
    public static void main(String [] args) {
        File f = new File("A/test.txt");
        
        try {
            f.createNewFile();
        }catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}