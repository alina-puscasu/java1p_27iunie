public class Produs implements java.io.Serializable {
    String denumire;
    double pret;
    
    transient String categorie;
    
    public Produs() {
    
    }
    
    public Produs(String denumire, double pret, String categorie) {
        this.denumire = denumire;
        this.pret = pret;
        this.categorie = categorie;
    }
}