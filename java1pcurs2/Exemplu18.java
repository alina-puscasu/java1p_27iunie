import java.nio.file.*;

public class Exemplu18 {
    public static void main(String [] args) {
        Path p = Paths.get("./");
        try {
            Files.walk(p, 2)
                 .filter(path -> path.toString().endsWith(".java"))
                 .forEach(path -> System.out.println(path));
        }catch(Exception e) {
            
        }
        
        //Files.find()
    }
}