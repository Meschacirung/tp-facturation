public class Devise extends DocumentCommercial {

    public Devise(long numero, Client client, Detail detail) {
        super(numero, client, detail);
    }

    @Override
    public double getTVA() {
        return 0;
    }

    @Override
    public double getTotal() {
        return 0;
    }
}
