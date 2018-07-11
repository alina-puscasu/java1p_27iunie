import java.util.stream.*;

public class Exemplu3 {
    
    public static void main(String [] args) {
        Stream<Integer> s1 = Stream.empty();
        Stream<Integer> s2 = Stream.of(10, 20, 30, 40);
        Stream<Integer> s3 = Stream.iterate(1, x -> x + 3);
        Stream<Integer> s4 = Stream.generate(() -> 1);
        
        s2.forEach(elem -> System.out.println(elem));
        
        s3.limit(10)
          .forEach(elem -> System.out.println(elem));
        s4.limit(5)
          .forEach(elem -> System.out.println(elem));
    }
}