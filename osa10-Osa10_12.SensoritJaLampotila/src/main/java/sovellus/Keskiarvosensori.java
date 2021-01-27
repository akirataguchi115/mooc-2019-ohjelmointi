package sovellus;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Keskiarvosensori implements Sensori {

    private List<Sensori> sensorit;
    private List<Integer> mittaukset;

    public Keskiarvosensori() {
        this.sensorit = new ArrayList<>();
        this.mittaukset = new ArrayList<>();
    }

    @Override
    public boolean onPaalla() {
        Iterator<Sensori> iteraattori = this.sensorit.iterator();
        while (iteraattori.hasNext()) {
            if (iteraattori.next().onPaalla() == false) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void paalle() {
        sensorit.forEach(sensori -> sensori.paalle());
    }

    @Override
    public void poisPaalta() {
        sensorit.forEach(sensori -> sensori.poisPaalta());
    }

    @Override
    public int mittaa() {
        int gjhk = (int) this.sensorit.stream().mapToInt(luku -> luku.mittaa()).average().getAsDouble();
        this.mittaukset.add(gjhk);
        return gjhk;
    }

    public void lisaaSensori(Sensori lisattava) {
        this.sensorit.add(lisattava);
    }

    public List<Integer> mittaukset() {
        return this.mittaukset;
    }
}
