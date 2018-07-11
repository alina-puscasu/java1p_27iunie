import java.util.*;

public class Exemplu8 {
    public static void main(String [] args) {
        List<Angajat> list = Arrays.asList(
            new Angajat("Popescu", "Cluj", 4000.25),
            new Angajat("Ionescu", "Bucuresti", 3500.25),
            new Angajat("Georgescu", "Constanta", 2800.75),
            new Angajat("Radulescu", "Bucuresti", 4400.25),
            new Angajat("Mihaescu", "Bucuresti", 6100.00)
        );
        
        boolean b1 = list.stream()
                         .allMatch(ang -> ang.adresa.equals("Bucuresti"));
        System.out.println("toti angajatii sunt din Bucuresti: " + b1);
        
        
        boolean b2 = list.stream()
                         .anyMatch(ang -> ang.salariu > 5000);
        System.out.println("cel putin un angajat are salariul" +
                           " > 5000: " + b2);
                           
        boolean b3 = list.stream()
                         .noneMatch(ang -> ang.salariu < 0) ;
        System.out.println("niciun angajat nu are salariul" +
                           " < 0: " + b3);                   
                           
                           
    }
}