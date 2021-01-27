
public class Tuote {

    private String nimi;
    private double hinta;
    private int lkm;

    public Tuote(String nimiAlussa, double hintaAlussa, int maaraAlussa) {
        this.nimi = nimiAlussa;
        this.hinta = hintaAlussa;
        this.lkm = maaraAlussa;
    }

    public void tulostaTuote() {
        System.out.print(nimi + ", hinta " + hinta
        + ", " + lkm + " kpl");
    }
}
