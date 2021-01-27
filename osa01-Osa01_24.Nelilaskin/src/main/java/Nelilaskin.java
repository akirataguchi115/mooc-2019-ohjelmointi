
import java.util.Scanner;

public class Nelilaskin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Syötä ensimmäinen luku!");
        int luku = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä toinen luku!");
        int toka = Integer.valueOf(lukija.nextLine());
        System.out.println(luku + " + " + toka + " = " + (luku + toka));
        System.out.println(luku + " - " + toka + " = " + (luku - toka));
        System.out.println(luku + " * " + toka + " = " + (luku * toka));
        System.out.println(luku + " / " + toka + " = " + ((double)luku / (double)toka));
        // toteuta ohjelma tänne

    }
}
