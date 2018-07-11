import java.util.*;

public class Exemplu5 {
    public static void main(String [] args) {
        List<Integer> list = Arrays.asList(5, 8, 2, 2, 5, 1);
        
        long nr = list.stream()
                      .distinct()
                      .count();
        System.out.println("nr elemente distincte: " + nr);
    }
}