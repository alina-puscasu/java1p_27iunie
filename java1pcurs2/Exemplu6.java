import java.nio.file.*;

public class Exemplu6 {
    
    
    public static void main(String [] args) {
        Path path = Paths.get("C:/A/B/C/D");
        
        for(int i = 0; i < path.getNameCount(); i++) {
            System.out.println(path.getName(i)); 
        }
        
        Path path2 = path.subpath(1, 3);
        System.out.println(path2);
    }
}