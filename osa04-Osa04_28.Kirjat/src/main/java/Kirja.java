
public class Kirja {

    private String nimi;
    private int pituus;
    private int vuosi;

    public Kirja(String nimi, int pituus, int vuosi) {
        this.nimi = nimi;
        this.pituus = pituus;
        this.vuosi = vuosi;
    }

    @Override
    public String toString() {
        return nimi + ", " + pituus + " sivua, " + vuosi;
    }

    public String getNimi() {
        return nimi;
    }

}
