import java.util.*;

public class Exemplu7 {
    /*
       Sa se creeze o clasa Angajat cu 3 atribute:
       nume, adresa si salariu (salariul are tipul double).
       Sa se creeze o lista cu 5 angajati.
       Sa se afiseze suma salariilor angajatilor din Bucuresti.

       */
    public static void main(String [] args) {
        List<Angajat> list = Arrays.asList(
            new Angajat("Popescu", "Cluj", 4000.25),
            new Angajat("Ionescu", "Bucuresti", 3500.25),
            new Angajat("Georgescu", "Constanta", 2800.75),
            new Angajat("Radulescu", "Bucuresti", 4400.25),
            new Angajat("Mihaescu", "Bucuresti", 6100.00)
        );
        double suma = list.stream()
                          .filter(ang -> ang.adresa.equals("Bucuresti"))
                          .mapToDouble(ang -> ang.salariu)
                          .sum();
        System.out.println("suma salariilor = " + suma);    
        
        double suma2 = list.stream()
                          .filter(ang -> ang.adresa.equals("Bucuresti"))
                          .mapToDouble(ang -> ang.salariu)
                          .reduce(0, (sal1, sal2) -> sal1 + sal2);
        
        System.out.println("suma salariilor = " + suma2); 
    }
}