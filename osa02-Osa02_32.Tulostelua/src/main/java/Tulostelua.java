
public class Tulostelua {

    public static void main(String[] args) {

        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.
        // HUOM: jos testit eivät meinaa mennä läpi, kokeile pääohjelmaa ajamalla,
        // että metodit toimivat niinkuin niiden on tarkoitus toimia!
        tulostaTahtia(3);
        System.out.println("\n---");  // tulostetaan kuvioiden välille ---
        tulostaNelio(4);
        System.out.println("\n---");
        tulostaSuorakulmio(5, 6);
        System.out.println("\n---");
        tulostaKolmio(3);
        System.out.println("\n---");
    }

    public static void tulostaTahtia(int maara) {
        // tehtävän ensimmäinen osa
        int luku = 0;
        while (luku < maara) {
            System.out.print("*");
            luku++;
        }
        System.out.print("\n");
    }

    public static void tulostaNelio(int sivunpituus) {
        int luku = 0;
        while (luku < sivunpituus) {
            tulostaTahtia(sivunpituus);
            luku++;
        }
        // tehtävän toinen osa
    }

    public static void tulostaSuorakulmio(int leveys, int korkeus) {
        int luku = 0;
        while (luku < korkeus) {
            tulostaTahtia(leveys);
            luku++;
        }
        // tehtävän kolmas osa
    }

    public static void tulostaKolmio(int koko) {
        int luku = 1;
        while (luku <= koko) {
            tulostaTahtia(luku);
            luku++;
        }
        // tehtävän neljäs osa
    }
}
