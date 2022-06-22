public class BonDeCommande extends DocumentCommercial{
    public BonDeCommande(long numero, Client client, Detail detail) {
        super(numero, client, detail);
    }

    @Override
    public double getTVA() {
        return getTotal() * 16 / 100;
    }

    @Override
    public double getTotal() {
        double somme = 0;
        for (Ligne ligne : this.getDetail().ligne){
            somme = somme + ligne.getPrixTotal();
        }
        return somme;
    }
}
