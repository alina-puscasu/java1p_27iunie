import java.io.*;
import java.util.*;

public class Exemplu5 {
    /*
       
       
       Se citeste din consola un numar intreg x, de pe prima linie din consola.
       Se citeste de pe a doua linie din consola denumirea unui fisier.
       
       Se va scrie in fisierul cu denumirea citita din consola x
       numere aleatoare, fiecare numar pe o linie separata.

       */
    public static void main(String [] args){
    
        try(InputStreamReader reader = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(reader)) {
                
            int x = Integer.parseInt(in.readLine()); 
            String fileName = in.readLine();
            
            try(PrintStream out = new PrintStream(fileName)) {
                Random r = new Random();
                for(int i = 0; i < x; i++) {
                    out.println(r.nextInt(30));
                }
            } catch(IOException e) {
                System.out.println(e.getMessage());
            }
        
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
        
        
        
        
        
        
        
        
        
        
        
    }
}