
import java.util.ArrayList;

public class Lastiruuma {

    private ArrayList<Matkalaukku> laukut;
    private int maksimipaino;

    public Lastiruuma(int max) {
        this.laukut = new ArrayList<>();
        this.maksimipaino = max;
    }

    public void lisaaMatkalaukku(Matkalaukku laukku) {
        if (yhteispaino() + laukku.yhteispaino() <= this.maksimipaino) {
            this.laukut.add(laukku);
        }
    }

    public int yhteispaino() {
        return this.laukut.stream().mapToInt(m -> m.yhteispaino()).sum();
    }

    @Override
    public String toString() {
        return this.laukut.size() + " matkalaukkua (" + yhteispaino() + " kg)";
    }

    public void tulostaTavarat() {
        this.laukut.forEach(laukku ->{
            laukku.tulostaTavarat();
        });
    }
}
