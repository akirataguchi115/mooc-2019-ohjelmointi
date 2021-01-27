
public class Velka {

    private double saldo;
    private double korkokerroin;

    public Velka(double saldo, double korkokerroin) {
        this.saldo = saldo;
        this.korkokerroin = korkokerroin;
    }

    public void tulostaSaldo() {
        System.out.println(saldo);
    }

    public void odotaVuosi() {
        saldo = saldo * korkokerroin;
    }

}
