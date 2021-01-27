
import java.util.HashMap;
import java.util.Map;

public class Velkakirja {

    private HashMap<String, Double> kirja;

    public Velkakirja() {
        this.kirja = new HashMap<>();
    }

    public void asetaLaina(String kenelle, double maara) {
        this.kirja.put(kenelle, maara);
    }

    public double paljonkoVelkaa(String kuka) {
        return this.kirja.getOrDefault(kuka, 0.0);
    }

}
