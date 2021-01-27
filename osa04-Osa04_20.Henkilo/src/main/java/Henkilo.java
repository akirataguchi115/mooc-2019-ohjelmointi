
public class Henkilo {

    private String nimi;
    private int ika;

    public Henkilo(String nimi) {
        this.nimi = nimi;
        this.ika = 0;
    }

    public void tulostaHenkilo() {
        System.out.print(nimi + ", ikä " + ika + " vuottan\n");
    }

    public void vanhene() {
        ika++;
    }

    public int palautaIka() {
        return ika;
    }

}
