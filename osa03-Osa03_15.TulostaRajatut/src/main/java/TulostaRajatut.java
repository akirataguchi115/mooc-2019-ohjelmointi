
import java.util.ArrayList;

public class TulostaRajatut {

    public static void main(String[] args) {
        // kokeile toteuttamasi metodin toimintaa täällä

    }

    public static void tulostaRajatutLuvut(ArrayList<Integer> luvut, int alaraja, int ylaraja) {
        for (int luku : luvut) {
            if (luku <= ylaraja && luku >= alaraja) {
                System.out.print(luku + "\n");
            }
        }
    }
}
