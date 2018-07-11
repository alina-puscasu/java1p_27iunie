import java.time.*;

public class Exemplu12 {
    public static void main(String [] args) {
        //ZoneId.getAvailableZoneIds()
        //      .stream()
        //      .forEach(z -> System.out.println(z));
        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("Europe/London"));
        System.out.println(zdt);
    }
}