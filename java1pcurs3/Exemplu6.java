import java.util.*;

public class Exemplu6 {
    /*
       Stream -> map(Function) -> Stream
       Stream -> mapToInt(ToIntFunction) -> IntStream
       Stream -> mapToLong(ToLongFunction) -> LongStream
       Stream -> mapToDouble(ToDoubleFunction) -> DoubleStream
       
       IntStream -> mapToObj() -> Stream
       
       */
    public static void main(String [] args){
        List<String> list = Arrays.asList("rosu", "verde", "albastru");
        list.stream()
            .map(elem -> elem.length())
            .forEach(elem -> System.out.println(elem));
            
        list.stream()
            .mapToInt(elem -> elem.length())
            .forEach(elem -> System.out.println(elem));
            
        int suma = list.stream()
                        .mapToInt(elem -> elem.length())
                        .sum();
        System.out.println("suma = " + suma);
        
        
    }
}