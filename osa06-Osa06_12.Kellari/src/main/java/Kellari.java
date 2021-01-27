
import java.util.ArrayList;
import java.util.HashMap;

public class Kellari {

    private HashMap<String, ArrayList<String>> komero;

    public Kellari() {
        this.komero = new HashMap<>();
    }

    public void lisaa(String komero, String tavara) {
        this.komero.putIfAbsent(komero, new ArrayList<>());
        this.komero.get(komero).add(tavara);
    }

    public ArrayList<String> sisalto(String komero) {
        if (this.komero.containsKey(komero)) {
            return this.komero.get(komero);
        }
        return new ArrayList<>();
    }

    public void poista(String komero, String tavara) {
        this.komero.get(komero).remove(tavara);
        if (!this.komero.containsKey(komero)) {
            this.komero.remove(komero);
        }
    }

    public ArrayList<String> komerot() {
        for (String nimi : this.komero.keySet()) {
            if (this.komero.get(nimi).isEmpty()) {
                this.komero.remove(nimi);
            }
        }
        ArrayList<String> lista = new ArrayList<>();
        lista.addAll(this.komero.keySet());
        return lista;
    }
}
