
public class MuistavaTuotevarasto extends Tuotevarasto {

    private Muutoshistoria historia;

    public MuistavaTuotevarasto(String tuotenimi, double tilavuus, double alkuSaldo) {
        super(tuotenimi, tilavuus);
        this.historia = new Muutoshistoria();
        this.historia.lisaa(alkuSaldo);
        super.lisaaVarastoon(alkuSaldo);
    }

    public String historia() {
        return this.historia.toString();
    }

    @Override
    public void lisaaVarastoon(double maara) {
        super.lisaaVarastoon(maara);
        this.historia.lisaa(super.getSaldo());
    }

    @Override
    public double otaVarastosta(double maara) {
        double ota = super.otaVarastosta(maara);
        this.historia.lisaa(super.getSaldo());
        return ota;
    }

    public void tulostaAnalyysi() {
        System.out.print("Tuote: " + super.getNimi()
                + "Historia: " + historia() + "\n"
                + "Suurin tuotemäärä: " + this.historia.maxArvo()
                + "Pienin tuotemäärä: " + this.historia.minArvo()
                + "Keskiarvo: " + this.historia.keskiarvo());
    }
}
