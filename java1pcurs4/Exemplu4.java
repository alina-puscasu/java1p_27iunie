import java.util.*;
import java.util.stream.*;

public class Exemplu4 {
    public static void main(String [] args) {
        List<Integer> list = Arrays.asList(2, 7, 1, 3, 6);
        
        List<Integer> res = list.stream()
                                .map(nr -> nr * nr)
                                .collect(Collectors.toList());
        System.out.println("res = " + res);
        
        ArrayList<Integer> res2 = 
                list.stream()
                    .map(nr -> nr * 100)
                    .collect(
                       Collectors.toCollection(ArrayList::new));  
    }
}