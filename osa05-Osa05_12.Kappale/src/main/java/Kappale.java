
public class Kappale {

    private String esittaja;
    private String nimi;
    private int pituusSekunteina;

    public Kappale(String esittaja, String nimi, int pituusSekunteina) {
        this.esittaja = esittaja;
        this.nimi = nimi;
        this.pituusSekunteina = pituusSekunteina;
    }

    @Override
    public String toString() {
        return this.esittaja + ": " + this.nimi + " (" + this.pituusSekunteina + " s)";
    }

    public boolean equals(Object verrattava) {
        if (this == verrattava) {
            return true;
        }

        if (!(verrattava instanceof Kappale)) {
            return false;
        }

        Kappale verrattavaKappale = (Kappale) verrattava;

        return this.esittaja == verrattavaKappale.esittaja
                && this.nimi == verrattavaKappale.nimi
                && this.pituusSekunteina == verrattavaKappale.pituusSekunteina;
    }

}
