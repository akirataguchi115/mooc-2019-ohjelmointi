
public class Sekuntikello {

    private Viisari sadasOsa;
    private Viisari sekunti;

    public Sekuntikello() {
        this.sadasOsa = new Viisari(100);
        this.sekunti = new Viisari(60);
    }

    @Override
    public String toString() {
        return sekunti.toString() + ":" + sadasOsa.toString();
    }

    public void etene() {
        sadasOsa.etene();
        if (sadasOsa.arvo() == 0) {
            sekunti.etene();
        }
    }
}
