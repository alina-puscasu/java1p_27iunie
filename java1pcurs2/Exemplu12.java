import java.nio.file.*;

public class Exemplu12 {
    
    
    public static void main(String [] args) {
        Path p1 = Paths.get("Exemplu1.java");
        Path p2 = Paths.get("copie.txt");
        
        try {
            Files.copy(p1, p2);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}