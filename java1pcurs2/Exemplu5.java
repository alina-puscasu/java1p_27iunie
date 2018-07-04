import java.nio.file.*;

public class Exemplu5 {
    /*
       
       
       
       java.nio.file
       Path
       Paths
       Files
       
       */
    public static void main(String [] args) {
        Path path1 = Paths.get("C:/A/B/C");
        Path path2 = Paths.get("X", "Y", "Z");
        
        System.out.println(path1.getClass());
        
        System.out.println(path1.getFileName());
        System.out.println(path1.getParent());
        System.out.println(path1.getRoot());
        
        System.out.println(path2.getFileName());
        System.out.println(path2.getParent());
        System.out.println(path2.getRoot());
    }
}