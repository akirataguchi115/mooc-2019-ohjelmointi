
import java.util.ArrayList;
import java.util.HashMap;

public class Sanakirja {

    private HashMap<String, String> sanakirja;

    public Sanakirja() {
        this.sanakirja = new HashMap<>();
    }

    public String kaanna(String sana) {
        return this.sanakirja.getOrDefault(sana, null);
    }

    public void lisaa(String sana, String kaannos) {
        this.sanakirja.putIfAbsent(sana, kaannos);
    }

    public int sanojenLukumaara() {
        return this.sanakirja.size();
    }

    public ArrayList<String> kaannoksetListana() {
        ArrayList<String> lista = new ArrayList<>();
        for (String avain : this.sanakirja.keySet()) {
            lista.add(avain + " = " + this.sanakirja.get(avain));
        }
        return lista;
    }
    
}
