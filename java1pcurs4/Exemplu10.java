import java.util.*;
import java.util.stream.*;

public class Exemplu10 {
    public static void main(String [] args) {
        Programator p1 = new Programator("P1");
        p1.limbaje.add("Java");
        p1.limbaje.add("PHP");
        
        Programator p2 = new Programator("P2");
        p2.limbaje.add("Python");
        p2.limbaje.add("C++");
        p2.limbaje.add("C#");
        
        List<Programator> list = Arrays.asList(p1, p2);
        
        List<String> res = list.stream()
                               .map(p -> p.limbaje)
                               .flatMap(l -> l.stream())
                               .collect(Collectors.toList());
        System.out.println("res = " + res);
        
        
        
        
        
        
    }
}