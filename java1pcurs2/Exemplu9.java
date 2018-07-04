import java.nio.file.*;

public class Exemplu9 {
    
    
    public static void main(String [] args) {
        Path p = Paths.get("A/B/C/./../.././X/Y/Z");
        
        Path p2 = p.normalize();
        System.out.println(p2);
    }
}