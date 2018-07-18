import java.util.*;
import java.util.stream.*;

public class Exemplu3 {
    public static void main(String [] args) {
    
        
        List<String> list = Arrays.asList("rosu", "galben", "albastru");
        
        String res = list.stream()
                         .map(x -> String.valueOf(x.length()))
                         .collect(Collectors.joining("/"));
        
        System.out.println("res = " + res);                 
    }
}