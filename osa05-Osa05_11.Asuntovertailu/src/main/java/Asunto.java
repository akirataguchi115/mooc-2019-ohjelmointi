
public class Asunto {

    private int huoneita;
    private int nelioita;
    private int neliohinta;

    public Asunto(int huoneita, int nelioita, int neliohinta) {
        this.huoneita = huoneita;
        this.nelioita = nelioita;
        this.neliohinta = neliohinta;
    }

    public int getNeliohinta() {
        return neliohinta;
    }

    public int getNelioita() {
        return nelioita;
    }

    public boolean suurempi(Asunto verrattava) {
        if (this.nelioita > verrattava.nelioita) {
            return true;
        }
        return false;
    }

    public int hintaero(Asunto verrattava) {
        return Math.abs(this.neliohinta * this.nelioita - verrattava.getNeliohinta()
                * verrattava.getNelioita());
    }

    public boolean kalliimpi(Asunto verrattava) {
        if (this.nelioita * this.neliohinta > verrattava.getNeliohinta()
                * verrattava.getNelioita()) {
            return true;
        }
        return false;
    }

}
