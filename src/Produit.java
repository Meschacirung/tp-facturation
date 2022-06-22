import java.util.Date;

public class Produit <T>{
    private String code;
    private String designation;
    private double prix;
    private T uniteMesure;
    private Date dateExpiration;

    public double getPrix(){
        return this.prix;
    }
}
