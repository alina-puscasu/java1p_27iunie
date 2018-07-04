import java.util.*;

public class Exemplu15 {
    public static void main(String [] args) {
        /*
           Streams API
           
           */
        List<String> lista = Arrays.asList("Bucuresti", "Sibiu", "Constanta", "Iasi");
        lista.stream()
             .filter(city -> city.length() > 5)
             .forEach(city -> System.out.println(city));
    }
}