
import java.util.ArrayList;
import java.util.Scanner;

public class KysytynLuvunIndeksi {

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

        System.out.print("Mitä etsitään? ");
        int etsitty = Integer.valueOf(lukija.nextLine());

        int indeksi = 0;
        int oikeaIndeksi = -1;
        while (indeksi < lista.size()) {
            if (lista.get(indeksi) == etsitty) {
                oikeaIndeksi = indeksi;
                System.out.print("Luku " + lista.get(oikeaIndeksi) + " "
                        + "indeksissä " + indeksi + "\n");
            }
            indeksi++;
        }
        if (oikeaIndeksi == -1) {
            System.out.print("");
            // toteuta tänne toiminnallisuus luvun etsimiseen
        }
    }
}
