
public class Opiskelija extends Henkilo {

    private int opintopisteita;

    public Opiskelija(String nimi, String osoite) {
        super(nimi, osoite);
        this.opintopisteita = 0;
    }

    public void opiskele() {
        this.opintopisteita++;
    }
    
    public int opintopisteita() {
        return this.opintopisteita;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  opintopisteitä "
                + this.opintopisteita;
    }
}
