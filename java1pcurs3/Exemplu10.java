import java.time.*;

public class Exemplu10 {
    public static void main(String [] args) {
        LocalTime lt1 = LocalTime.now();
        System.out.println("lt1: " + lt1);
        
        LocalTime lt2 = LocalTime.of(4, 5, 15);
        System.out.println("lt2: " + lt2);
        
        LocalTime lt3 = LocalTime.of(4, 20);
        System.out.println("lt3: " + lt3);
    }
}