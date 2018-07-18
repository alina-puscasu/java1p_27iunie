import java.util.*;

public class Exemplu2 {
    public static void main(String [] args) {
        
        
        
        Locale loc1 = new Locale("ro", "RO");
        ResourceBundle res = ResourceBundle.getBundle("translations", 
                                                        loc1);
                                                        
        System.out.println(res.getString("lblButton"));                                                
    }
}