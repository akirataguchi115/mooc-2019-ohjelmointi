
public class TulosteluaLikeABoss {

    public static void tulostaTahtia(int maara) {
        // tehtävän ensimmäinen osa
        int luku = 0;
        while (luku < maara) {
            System.out.print("*");
            luku++;
        }
        System.out.print("\n");
    }

    public static void tulostaTyhjaa(int maara) {
        // tehtävän osa 1
        int luku = 0;
        while (luku < maara) {
            System.out.print(" ");
            luku++;
        }
    }

    public static void tulostaKolmio(int koko) {
        // tehtävän osa 2
        int indeksi = 1;
        while (indeksi <= koko) {
            tulostaTyhjaa(koko - indeksi);
            tulostaTahtia(indeksi);
            indeksi++;
        }
    }

    public static void jouluKuusi(int korkeus) {
        // tehtävän osa 3
        int indeksi = 1;
        int tyhjaa = 1;

        while (tyhjaa <= korkeus) {
            tulostaTyhjaa(korkeus - tyhjaa);
            tulostaTahtia(indeksi);
            indeksi+=2;
            tyhjaa++;
        }
        tulostaTyhjaa(korkeus - 2);
        tulostaTahtia(3);
        tulostaTyhjaa(korkeus - 2);
        tulostaTahtia(3);
    }

    public static void main(String[] args) {
        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.

        tulostaKolmio(5);
        System.out.println("---");
        jouluKuusi(4);
        System.out.println("---");
        jouluKuusi(10);
    }
}
