import java.util.*;
import java.util.stream.*;

public class Exemplu5 {
    public static void main(String [] args) {
        List<Produs> list = Arrays.asList(
            new Produs("telefon", 1500.5, "electronice", 3),
            new Produs("marker", 3.4, "birotica", 15),
            new Produs("laptop", 2800.6, "electronice", 4),
            new Produs("frigider", 1600.3, "electrocasnice", 6)
        );
        
        Map<String, Double> res = 
                    list.stream()
                        .collect(Collectors.toMap(p -> p.denumire, 
                                                  p -> p.pret)); 
        
        System.out.println("res = " + res);
        
        
        
        
        
    }
}