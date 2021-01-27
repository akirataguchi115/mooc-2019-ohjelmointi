
public class Henkilo {

    private String nimi;
    private Koulutus koulutus;

    public Henkilo(String nimi, Koulutus koulutus) {
        this.nimi = nimi;
        this.koulutus = koulutus;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public Koulutus getKoulutus() {
        return koulutus;
    }

    public void setKoulutus(Koulutus koulutus) {
        this.koulutus = koulutus;
    }

    @Override
    public String toString() {
        return this.nimi + ", " + this.koulutus;
    }

}
