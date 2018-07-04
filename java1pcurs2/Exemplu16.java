import java.nio.file.*;

public class Exemplu16 {
    public static void main(String [] args) {
        Path p = Paths.get("Exemplu1.java");
        
        try {
            Files.lines(p)
                 .filter(line -> line.contains("*"))
                 .forEach(line -> System.out.println(line));
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}