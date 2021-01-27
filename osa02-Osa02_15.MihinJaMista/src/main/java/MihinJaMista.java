
import java.util.Scanner;

public class MihinJaMista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Mihin asti? ");
        int luku = Integer.valueOf(lukija.nextLine());
        System.out.print("Mistä lähtien? ");
        int alku = Integer.valueOf(lukija.nextLine());

        while (alku <= luku) {
            System.out.println(alku);
            alku++;
        }

        // KIRJOITA OHJELMASI TÄNNE
    }
}
