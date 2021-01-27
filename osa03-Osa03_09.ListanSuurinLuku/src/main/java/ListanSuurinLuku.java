
import java.util.ArrayList;
import java.util.Scanner;

public class ListanSuurinLuku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        while (true) {
            int luettu = Integer.valueOf(lukija.nextLine());
            if (luettu == -1) {
                break;
            }

            lista.add(luettu);
        }

        System.out.println("");

        int suurin = 0;
        int indeksi = 0;
        while (indeksi <= lista.size() - 1) {
            if (suurin < lista.get(indeksi)) {
                suurin = lista.get(indeksi);
            }
            indeksi++;
        }
        System.out.print("Listan suurin indeksi: " + suurin);
    }
}
