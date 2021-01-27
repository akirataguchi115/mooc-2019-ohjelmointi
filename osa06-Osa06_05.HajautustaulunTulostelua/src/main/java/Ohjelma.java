
import java.util.HashMap;

public class Ohjelma {

    public static void main(String[] args) {
        // Testaa ohjelmasi toimintaa täällä!
        HashMap<String, String> hm = new HashMap<>();
        hm.put("abcd", "jkl");
        hm.put("def", "mno");
        hm.put("ghi", "pqr");
        tulostaArvotJosAvaimessa(hm, "a");
    }

    public static void tulostaAvaimet(HashMap<String, String> hajautustaulu) {
        for (String avain : hajautustaulu.keySet()) {
            System.out.println(avain);
        }
    }

    public static void tulostaAvaimetJoissa(HashMap<String, String> hajautustaulu, String merkkijono) {
        for (String avain : hajautustaulu.keySet()) {
            if (avain.contains(merkkijono)) {
                System.out.println(avain);
            }
        }
    }

    public static void tulostaArvotJosAvaimessa(HashMap<String, String> hajautustaulu, String merkkijono) {
        for (String avain : hajautustaulu.keySet()) {
            if (avain.contains(merkkijono)) {
                System.out.println(hajautustaulu.get(avain));
            }
        }
    }
}
