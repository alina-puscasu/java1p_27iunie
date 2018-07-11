import java.time.*;

public class Exemplu9 {
    /*
       java.time
       
       LocalDate
       LocalTime
       LocalDateTime
       ZonedDateTime
       
       ZoneId
       
       Period
       Duration
       Instant
       
       */
    
    public static void main(String [] args) {
        LocalDate ld1 = LocalDate.now();
        System.out.println("ld1: " + ld1);
        
        LocalDate ld2 = LocalDate.of(2015, 5, 10);
        System.out.println("ld2: " + ld2);
        
        LocalDate ld3 = LocalDate.of(2017, Month.JUNE, 12);
        System.out.println("ld3: " + ld3);
        
        //LocalDate ld4 = LocalDate.of(2017, 15, 12);
        
        LocalDate ld4 = ld3.plusMonths(2);
        System.out.println("ld4: " + ld4);
        System.out.println("ld3: " + ld3);
        
        if(ld3.isBefore(ld4)) {
            System.out.println("ld3 is before ld4");
        }
    }
}