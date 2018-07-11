public class Exemplu1 {
    public static void main(String [] args) {
        String s1 = "hello world";
        
        Consumator c1 = new Consumator() {
            public void consuma(String s) {
                System.out.println(s);
            }
        };
        
        c1.consuma(s1);
        
        Consumator c2 = s -> System.out.println(s);
        c2.consuma(s1);
        
        
        Consumator c3 = (String s) -> System.out.println(s);
        c3.consuma(s1);
        
        Consumator c4 = s -> {
            if(s.length() % 2 == 0) {
                System.out.println("sirul are numar par de caractere");
            } else {
                System.out.println("sirul are numar impar de caractere");
            }
        };
        c4.consuma(s1);
        
        
    }
}