import java.util.ArrayList;

abstract public class DocumentCommercial {
    private long numero;
    private Client client;

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Detail getDetail() {
        return detail;
    }

    public void setDetail(Detail detail) {
        this.detail = detail;
    }

    private Detail detail;

    public DocumentCommercial(long numero, Client client, Detail detail) {
        this.detail = detail;
        this.numero = numero;
        this.client = client;
    }

    public abstract double getTotal();
    public abstract double getTVA();
}