
import java.util.HashMap;

public class Ohjelma {

    public static void main(String[] args) {
        // Testaa ohjelmasi toimintaa täällä!
    }

    public static void tulostaArvot(HashMap<String, Kirja> hajautustaulu) {
        for (Kirja kirja : hajautustaulu.values()) {
            System.out.println(kirja);
        }
    }

    public static void tulostaArvoJosNimessa(HashMap<String, Kirja> hajautustaulu, String merkkijono) {
        for (Kirja kirja : hajautustaulu.values()) {
            if (kirja.getNimi().contains(merkkijono)) {
                System.out.println(kirja);
            }
        }
    }

}
