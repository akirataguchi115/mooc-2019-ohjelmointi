
import java.util.ArrayList;
import java.util.List;

public class Resepti {

    private String nimi;
    private int keittoaika;
    private List<String> raakaAineet;

    public Resepti() {
        this.nimi = "";
        this.keittoaika = 0;
        this.raakaAineet = new ArrayList<>();
    }

    public String getNimi() {
        return nimi;
    }

    public int getKeittoaika() {
        return keittoaika;
    }

    public List<String> getRaakaAineet() {
        return raakaAineet;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public void setKeittoaika(int keittoaika) {
        this.keittoaika = keittoaika;
    }

    public void setRaakaAineet(List<String> raakaAineet) {
        this.raakaAineet = raakaAineet;
    }

    public void lisaaRaakaAine(String raakis) {
        this.raakaAineet.add(raakis);
    }

    @Override
    public String toString() {
        return this.nimi + ", keittoaika: " + this.keittoaika;
    }
}
