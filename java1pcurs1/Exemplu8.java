import java.io.*;

public class Exemplu8 {
    public static void main(String [] args) {
        C c = new C();
        
        
        try(FileOutputStream file = new FileOutputStream("instantac.dat");
            ObjectOutputStream out = new ObjectOutputStream(file)) {
                out.writeObject(c);
        }catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}