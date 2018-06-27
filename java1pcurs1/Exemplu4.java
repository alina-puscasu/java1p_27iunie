import java.io.*;

public class Exemplu4 {
    
    public static void main(String [] args) {
        try(FileInputStream file = new FileInputStream("Exemplu2.java");
            InputStreamReader reader = new InputStreamReader(file);
            BufferedReader in = new BufferedReader(reader);
            PrintStream out = new PrintStream("test.txt")) {
                
                String line = "";
                while( (line = in.readLine()) != null ) {
                    out.println(line);
                }
        
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
        
    }
}