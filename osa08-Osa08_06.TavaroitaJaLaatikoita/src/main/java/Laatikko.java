
import java.util.ArrayList;
import java.util.List;

public class Laatikko implements Talletettava {

    private List<Talletettava> sisalto;
    private double maksimipaino;

    public Laatikko(double maksimipaino) {
        this.sisalto = new ArrayList<>();
        this.maksimipaino = maksimipaino;
    }

    public void lisaa(Talletettava esine) {
        if (paino() + esine.paino()
                > this.maksimipaino) {
            return;
        }
        this.sisalto.add(esine);
    }

    @Override
    public double paino() {
        return this.sisalto.stream().mapToDouble(m -> m.paino()).sum();
    }

    @Override
    public String toString() {
        return "Laatikko: " + this.sisalto.size() + " esinettä, paino "
                + "yhteensä " + this.paino() + " kiloa";
    }
}
