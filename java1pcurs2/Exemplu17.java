import java.nio.file.*;

public class Exemplu17 {
    public static void main(String [] args) {
        Path p = Paths.get("./");
        try {
            Files.list(p)
                 .filter(path -> path.toString().endsWith(".java"))
                 .forEach(path -> System.out.println(path));
        }catch(Exception e) {
            
        }
    }
}