package maatila;

public class Maitosailio {

    private double tilavuus;
    private double saldo;

    public Maitosailio() {
        this.tilavuus = 2000.0;
        this.saldo = 0;
    }

    public Maitosailio(double tilavuus) {
        this.tilavuus = tilavuus;
        this.saldo = 0;
    }

    public double getTilavuus() {
        return tilavuus;
    }

    public double getSaldo() {
        return saldo;
    }

    public double paljonkoTilaaJaljella() {
        return tilavuus - saldo;
    }

    public void lisaaSailioon(double maara) {
        this.saldo += maara;
        if (this.saldo > this.tilavuus) {
            this.saldo = this.tilavuus;
        }
    }

    public double otaSailiosta(double maara) {
        if (maara > this.saldo) {
            this.saldo = 0;
            return this.saldo;
        }
        this.saldo -= maara;
        return maara;
    }

    @Override
    public String toString() {
        return Math.ceil(this.saldo) + "/" + Math.ceil(this.tilavuus);
    }
}
