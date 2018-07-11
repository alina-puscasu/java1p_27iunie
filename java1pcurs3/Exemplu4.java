import java.util.*;

public class Exemplu4 {
    public static void main(String [] args) {
        List<String> list = Arrays.asList("telefon", "pix", "mouse",
                                          "tastatura");
        list.stream()
            .filter(s -> s.length() > 5)
            .forEach(s -> System.out.println(s));
            
        System.out.println(list);
    }
}