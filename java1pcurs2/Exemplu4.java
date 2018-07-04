import java.io.*;

public class Exemplu4 {
    public static void main(String[] args) {
        try (InputStreamReader reader = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(reader)) {
                String line = "";
                while(true) {
                    line = in.readLine();
                    String[] v = line.split("\\s+");
                    File f = null;
                    switch(v[0]) {
                        case "createfile" : 
                            f = new File(v[1]);
                            f.createNewFile();
                        break;
                        case "createdirectory" : 
                            f = new File(v[1]);
                            f.mkdir();
                        break;
                        case "delete" : 
                            f = new File(v[1]);
                            f.delete();
                        break;
                        case "list" : 
                            f = new File(v[1]);
                            String [] fileNames = f.list();
                            for(String fileName : fileNames) {
                                System.out.println(fileName);
                            }
                            
                            //f.listFiles();
                        break;
                        case "exit" : 
                            System.exit(0);
                        break;
                        default : System.out.println("Comanda nu exista");
                    }
                }
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}