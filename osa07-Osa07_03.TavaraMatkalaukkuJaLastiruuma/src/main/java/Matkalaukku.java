
import java.util.ArrayList;
import java.util.Comparator;

public class Matkalaukku {

    private ArrayList<Tavara> tavarat;
    private int maksimipaino;

    public Matkalaukku(int maksimipaino) {
        this.maksimipaino = maksimipaino;
        this.tavarat = new ArrayList<>();
    }

    public void lisaaTavara(Tavara tavara) {
        if (yhteispaino() + tavara.getPaino() <= maksimipaino) {
            this.tavarat.add(tavara);
        }
    }

    @Override
    public String toString() {
        switch (this.tavarat.size()) {
            case 0:
                return "ei tavaroita (0 kg)";
            case 1:
                return "1 tavara (" + yhteispaino() + " kg)";
            default:
                return this.tavarat.size() + " tavaraa ("
                        + yhteispaino() + " kg)";
        }
    }

    public int yhteispaino() {
        return this.tavarat.stream().mapToInt(m -> m.getPaino()).sum();
    }

    public void tulostaTavarat() {
        this.tavarat.forEach((t) -> {
            System.out.println(t);
        });
    }

    public Tavara raskainTavara() {
        if (this.tavarat.isEmpty()) {
            return null;
        }
        return this.tavarat.stream()
                .max(Comparator.comparing(i -> i.getPaino())).get();
    }
}
