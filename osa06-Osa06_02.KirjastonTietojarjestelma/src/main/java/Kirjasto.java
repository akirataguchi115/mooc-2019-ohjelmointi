
import java.util.ArrayList;
import java.util.List;

public class Kirjasto {

    private List<Kirja> kirjasto;

    public Kirjasto() {
        this.kirjasto = new ArrayList<>();
    }

    public void lisaaKirja(Kirja uusiKirja) {
        kirjasto.add(uusiKirja);
    }

    public void tulostaKirjat() {
        for (Kirja kirja : kirjasto) {
            System.out.println(kirja);
        }
    }

    public ArrayList<Kirja> haeKirjaNimekkeella(String nimeke) {
        ArrayList<Kirja> loydetyt = new ArrayList<>();
        for (Kirja kirja : kirjasto) {
            if (StringUtils.sisaltaa(kirja.nimeke(), nimeke)) {
                loydetyt.add(kirja);
            }
        }
        return loydetyt;
    }

    public ArrayList<Kirja> haeKirjaJulkaisijalla(String julkaisija) {
        ArrayList<Kirja> loydetyt = new ArrayList<>();
        for (Kirja kirja : kirjasto) {
            if (StringUtils.sisaltaa(kirja.julkaisija(), julkaisija)) {
                loydetyt.add(kirja);
            }
        }
        return loydetyt;
    }

    public ArrayList<Kirja> haeKirjaJulkaisuvuodella(int julkaisuvuosi) {
        ArrayList<Kirja> loydetyt = new ArrayList<>();
        for (Kirja kirja : kirjasto) {
            if (kirja.julkaisuvuosi() == julkaisuvuosi) {
                loydetyt.add(kirja);
            }
        }
        return loydetyt;
    }

}
