public class Produs {
    String denumire;
    double pret;
    
    String categorie;
    int stoc;
    
    public Produs(String denumire, double pret, String categorie,
                    int stoc) {
       this.denumire = denumire;
       this.pret = pret;
       this.categorie = categorie;
       this.stoc = stoc;
    }
    
    public String toString() {
        return denumire + "/" + pret + "/" + categorie + "/" + stoc;
    }
}