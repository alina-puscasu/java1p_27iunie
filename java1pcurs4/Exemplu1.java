import java.util.*;

public class Exemplu1 {
    public static void main(String [] args) {
        
        Locale loc1 = new Locale("en");
        Locale loc2 = new Locale("en", "US");
        
        System.out.println("loc1: " + loc1.getLanguage());
        System.out.println("loc2: " + loc2.getLanguage() + " " +
                        loc2.getCountry());
        
        Locale loc3 = new Locale.Builder()
                                .setLanguage("ro")
                                .build();                
                        
        Locale loc4 = Locale.GERMANY;    
        
        System.out.println(Locale.getDefault());
    }
}