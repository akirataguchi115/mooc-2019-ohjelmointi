
import java.util.ArrayList;

public class Muutoshistoria {

    private ArrayList<Double> historia;

    public Muutoshistoria() {
        this.historia = new ArrayList<>();
    }

    public void lisaa(double tilanne) {
        this.historia.add(tilanne);
    }

    public void nollaa() {
        this.historia.clear();
    }

    @Override
    public String toString() {
        return this.historia.toString();
    }

    public double maxArvo() {
        return this.historia.stream().mapToDouble(m -> m).max().getAsDouble();
    }

    public double minArvo() {
        return this.historia.stream().mapToDouble(m -> m).min().getAsDouble();
    }

    public double keskiarvo() {
        return this.historia.stream().mapToDouble(m -> m).average().getAsDouble();
    }

}
