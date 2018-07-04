import java.io.*;
import java.nio.file.*;

public class Exemplu13 {
    
    public static void main(String [] args) {
        //readFromFile1();
        readFromFile2();
    }
    
    public static void readFromFile1() {
        try (FileInputStream file = new FileInputStream("Exemplu1.java");
            InputStreamReader reader = new InputStreamReader(file);
            BufferedReader in = new BufferedReader(reader)) {
                String line = "";
                while( (line = in.readLine()) != null ) {
                    System.out.println(line);
                }
        }catch(Exception e) {
        
        }
    }
    
    public static void readFromFile2() {
        Path p = Paths.get("Exemplu1.java");
        try(BufferedReader in = Files.newBufferedReader(p)) {
                String line = "";
                while( (line = in.readLine()) != null ) {
                    System.out.println(line);
                }
        }catch(Exception e) {
        
        }
    }
    
    
    
    
    
    
}