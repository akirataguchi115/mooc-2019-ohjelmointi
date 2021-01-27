
public class CDLevy implements Talletettava {

    private String tekija;
    private String nimi;
    private int vuosi;

    public CDLevy(String tekija, String nimi, int vuosi) {
        this.tekija = tekija;
        this.nimi = nimi;
        this.vuosi = vuosi;
    }

    @Override
    public double paino() {
        return 0.1;
    }

    @Override
    public String toString() {
        return this.tekija + ": " + this.nimi + " (" + this.vuosi + ")";
    }

}
