import java.util.function.*;

public class Exemplu2 {
    /*
       java.util.function
       
       Predicate<T>
       Supplier<T>
       Consumer<T>
       Function<T, R>
       UnaryOperator<T>
       BiFunction<T, U, R>
       BinaryOperator<T>
       */
    public static void main(String [] args) {
        Predicate<Integer> p = n -> n % 5 == 0;
        System.out.println(p.test(15));
        
        Function<String, Integer> f = (String s) -> s.length();
        System.out.println(f.apply("hello world"));
    }
}