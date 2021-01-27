
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // voit testata luokkaasi täällä

    }

    public static int summa(int[] taulukko, int mista, int mihin, int pienin, int suurin) {
        int from = mista;
        int to = mihin;
        if (mista < 0) {
            from = 0;
        }
        if (mihin > taulukko.length) {
            to = taulukko.length;
        }
        int summa = 0;
        for (int i = from; i < to; i++) {
            int luku = taulukko[i];
            if (luku >= pienin && luku <= suurin) {
                summa += luku;
            }
        }
        return summa;
    }

}
