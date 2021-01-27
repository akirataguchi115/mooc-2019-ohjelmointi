
import java.util.Scanner;

public class Salasana {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        String salasana = "porkkana"; // käytä porkkanaa salasanana testejä ajaessasi!

        while (true) {
            System.out.print("Anna salasana: ");
            if (lukija.nextLine().equals(salasana)) {
                break;
            }
            System.out.print("Väärin!\n");
        }
        System.out.print("Oikein!\n\nSalaisuus on: dejavu");
        // Toteuta ohjelmasi tähän.
    }
}
