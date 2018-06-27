import java.io.*;

public class Exemplu1 {
    /*
       
        IO Streams
        java.io
        
        in
            low level
                InputStream
                FileInputStream
                ByteArrayInputStream
            
            high level
                BufferedReader
                ObjectInputStream
                DataInputStream
            
        out
            low level
                OutputStream
                FileOutputStream
                ByteArrayOutputStream
            
            high level
                PrintStream
                PrintWriter
                ObjectOutputStream
                DataOutputStream
       */
      public static void main(String [] args) {
           InputStreamReader reader = new InputStreamReader(System.in);
           BufferedReader in = new BufferedReader(reader);
           
           try {
               String line = in.readLine();
               System.out.println(new StringBuilder(line).reverse());
           } catch(IOException e) {
               System.out.println(e.getMessage());
           } finally {
               try {
                   in.close();
                   reader.close();
               } catch(IOException e) {
                   System.out.println(e.getMessage());
               }
           }
        
        
        
        
        
        
        
        
        
        
       }
}