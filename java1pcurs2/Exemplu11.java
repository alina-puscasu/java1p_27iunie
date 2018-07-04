import java.nio.file.*;
import java.io.*;

public class Exemplu11 {
    public static void main(String [] args) {
        Path p = Paths.get("A/tema.txt");
        
        try {
            //Files.delete(p);  --> NoSuchFileException
            Files.deleteIfExists(p);
        }catch(IOException e) {
            System.out.println(e.getClass() + " " + e.getMessage());
        }
    }
}