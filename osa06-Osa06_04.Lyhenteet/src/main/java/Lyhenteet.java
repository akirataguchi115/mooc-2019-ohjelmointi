
import java.util.HashMap;
import java.util.Map;

public class Lyhenteet {

    private Map<String, String> mappi;

    public Lyhenteet() {
        this.mappi = new HashMap<>();
    }

    public void lisaaLyhenne(String lyhenne, String selite) {
        this.mappi.put(lyhenne, selite);
    }

    public boolean onkoLyhennetta(String lyhenne) {
        if (this.mappi.containsKey(lyhenne)) {
            return true;
        }
        return false;
    }

    public String haeLyhenne(String lyhenne) {
        return this.mappi.get(lyhenne);
    }
}
