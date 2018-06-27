import java.io.*;

public class Exemplu6 {
    public static void main(String [] args) {
        Produs p = new Produs("pix", 1.5, "birotica");
        
        
        try(FileOutputStream file = new FileOutputStream("produs.dat");
            ObjectOutputStream out = new ObjectOutputStream(file)) {
                out.writeObject(p);
        }catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}