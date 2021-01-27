
import java.util.ArrayList;
import java.util.List;

public class Lauma implements Siirrettava {

    private List<Siirrettava> lauma;

    public Lauma() {
        this.lauma = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        this.lauma.forEach(yksilo -> {
            sb.append(yksilo + "\n");
        });
        return sb.toString();
    }

    public void lisaaLaumaan(Siirrettava siirrettava) {
        this.lauma.add(siirrettava);
    }

    @Override
    public void siirra(int dx, int dy) {
        this.lauma.forEach(yksilo -> {
            yksilo.siirra(dx, dy);
        });
    }
}
