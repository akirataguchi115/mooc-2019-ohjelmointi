
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Varasto {

    private Map<String, Integer> hinnat;
    private Map<String, Integer> saldot;

    public Varasto() {
        this.hinnat = new HashMap<>();
        this.saldot = new HashMap<>();
    }

    public void lisaaTuote(String tuote, int hinta, int saldo) {
        this.hinnat.putIfAbsent(tuote, hinta);
        this.saldot.putIfAbsent(tuote, saldo);
    }

    public int hinta(String tuote) {
        return this.hinnat.getOrDefault(tuote, -99);
    }

    public int saldo(String tuote) {
        return this.saldot.getOrDefault(tuote, 0);
    }

    public boolean ota(String tuote) {
        if (this.saldot.containsKey(tuote)) {
            if (this.saldot.get(tuote) > 0) {
                this.saldot.put(tuote, this.saldot.get(tuote) - 1);
                return true;
            }
        }
        return false;
    }

    public Set<String> tuotteet() {
        return this.hinnat.keySet();
    }
}
