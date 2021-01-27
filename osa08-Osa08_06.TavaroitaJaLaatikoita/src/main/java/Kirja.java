
public class Kirja implements Talletettava {

    private double paino;
    private String tekija;
    private String nimi;

    public Kirja(String tekija, String nimi, double paino) {
        this.paino = paino;
        this.tekija = tekija;
        this.nimi = nimi;
    }

    @Override
    public double paino() {
        return this.paino;
    }

    @Override
    public String toString() {
        return this.tekija + ": " + this.nimi;
    }

}
