
import java.util.ArrayList;

public class Pakkaus {

    private ArrayList<Lahja> pakkaus;

    public Pakkaus() {
        this.pakkaus = new ArrayList<>();
    }

    public void lisaaLahja(Lahja lahja) {
        this.pakkaus.add(lahja);
    }

    public int yhteispaino() {
        return pakkaus.stream().mapToInt(paino -> paino.getPaino()).sum();
    }

}
