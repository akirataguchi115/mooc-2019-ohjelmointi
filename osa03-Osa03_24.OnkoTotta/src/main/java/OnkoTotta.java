
import java.util.Scanner;

public class OnkoTotta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Kirjoita merkkijono: ");
        String oikein = "totta";
        String totta = lukija.nextLine();
        if (totta.equals(oikein)) {
            System.out.print("Oikein meni!");
        } else {
            System.out.print("Koitappa uudelleen!");
        }
    }
}
