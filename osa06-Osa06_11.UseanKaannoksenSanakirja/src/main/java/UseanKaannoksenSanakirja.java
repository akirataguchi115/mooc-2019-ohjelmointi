
import java.util.ArrayList;
import java.util.HashMap;

public class UseanKaannoksenSanakirja {

    private HashMap<String, ArrayList<String>> mappi;

    public UseanKaannoksenSanakirja() {
        this.mappi = new HashMap<>();
    }

    public void lisaa(String sana, String kaannos) {
        this.mappi.putIfAbsent(sana, new ArrayList<>());
        this.mappi.get(sana).add(kaannos);
    }

    public ArrayList<String> kaanna(String sana) {
        if (this.mappi.containsKey(sana)) {
            return this.mappi.get(sana);
        }
        return new ArrayList<>();
    }

    public void poista(String sana) {
        this.mappi.remove(sana);
    }
}
