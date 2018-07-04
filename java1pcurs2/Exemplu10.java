import java.nio.file.*;
import java.io.*;

public class Exemplu10 {
    
    
    public static void main(String [] args) {
        Path p = Paths.get("A/tema.txt");
        Path p2 = Paths.get("C");
        
        try {
            Files.createFile(p);
            Files.createDirectory(p2);
        }catch(IOException e) {
            System.out.println(e.getClass() + " " + e.getMessage());
        }
    }
}