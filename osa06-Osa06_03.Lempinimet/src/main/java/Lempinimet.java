
import java.util.HashMap;

public class Lempinimet {
    
    public static void main(String[] args) {
        // Tee tehtävänannossa pyydetyt operaatiot täällä!
        HashMap<String, String> mappi = new HashMap<>();
        mappi.put("matti", "mage");
        mappi.put("mikael", "mixu");
        mappi.put("arto", "arppa");
        
        System.out.println(mappi.get(("mikael")));
    }
    
}
