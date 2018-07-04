import java.nio.file.*;
import java.util.*;

public class Exemplu14 {
    public static void main(String [] args) {
        Path p = Paths.get("Exemplu1.java");
        try {
            List<String> lines = Files.readAllLines(p);
            lines.forEach(System.out::println);
        }catch(Exception e) {
        
        }
    }
}