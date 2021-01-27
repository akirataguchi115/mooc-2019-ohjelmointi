
import java.util.HashMap;
import java.util.Map;

public class Ostoskori {

    private Map<String, Ostos> kori;

    public Ostoskori() {
        this.kori = new HashMap<>();
    }

    public void lisaa(String tuote, int hinta) {
        if (this.kori.containsKey(tuote)) {
            this.kori.get(tuote).kasvataMaaraa();
        } else {
            this.kori.put(tuote, new Ostos(tuote, 1, hinta));
        }
    }

    public int hinta() {
        return this.kori.values().stream().mapToInt(m -> m.hinta()).sum();
    }

    public void tulosta() {
        this.kori.values().forEach(ostos -> {
            System.out.println(ostos);
        });
    }
}
