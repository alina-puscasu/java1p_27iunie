import java.time.*;

public class Exemplu11 {
    public static void main(String [] args) {
        LocalDateTime ldt1 = LocalDateTime.now();
        System.out.println("ldt1: " + ldt1);
        
        LocalDateTime ldt2 = LocalDateTime.of(
            2018, 4, 15, 9, 10, 3);
        System.out.println("ldt2: " + ldt2);
        
        LocalDate ld = LocalDate.now();
        LocalTime lt = LocalTime.now();
        LocalDateTime ldt3 = LocalDateTime.of(ld, lt);
        System.out.println("ldt3: " + ldt3);
    }
}