
public class Maksukortti {

    private double saldo;

    public Maksukortti(double maara) {
        this.saldo = maara;
    }

    public void syoEdullisesti() {
        if (this.saldo >= 2.60) {
            this.saldo -= 2.60;
        }
    }

    public void syoMaukkaasti() {
        if (this.saldo >= 4.60) {
            this.saldo -= 4.60;
        }
    }

    public void lataaRahaa(double rahamaara) {
        if (rahamaara >= 0) {
            this.saldo += rahamaara;
            if (saldo > 150) {
                this.saldo = 150;
            }
        }
    }

    @Override
    public String toString() {
        return "Kortilla on rahaa " + this.saldo + " euroa";
    }

}
