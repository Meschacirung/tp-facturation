public class Ligne {
    private int numero;
    private int quantite;
    private Produit produit;

    public double getPrixTotal()
    {
        return this.produit.getPrix() * this.quantite;
    }

}
