
public class Opettaja extends Henkilo {

    private int kuukausipalkka;

    public Opettaja(String nimi, String osoite, int palkka) {
        super(nimi, osoite);
        this.kuukausipalkka = palkka;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  palkka " + this.kuukausipalkka
                + " euroa/kk";
    }

}
