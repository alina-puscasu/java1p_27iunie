import java.io.*;



public class Exemplu9 {
    public static void main(String [] args) {
        try(FileInputStream file = new FileInputStream("instantac.dat");
            ObjectInputStream in = new ObjectInputStream(file)) {
                C p = (C)in.readObject();
        } catch(IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}