
import java.io.File;
import java.util.Scanner;

public class LoytyykoTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Minkä niminen tiedosto luetaan? ");
        String tiedosto = lukija.nextLine();
        System.out.println("Mitä etsitään?");
        String etsittava = lukija.nextLine();
        boolean loytyi = false;

        try (Scanner tiedostonLukija = new Scanner(new File(tiedosto))) {
            while (tiedostonLukija.hasNext()) {
                if (tiedostonLukija.nextLine().equals(etsittava)) {
                    System.out.print("Löytyi!");
                    loytyi = true;
                    break;
                }
            }
        } catch (Exception e) {
            System.out.print("Tiedoston lukeminen epäonnistui.");
        }

        if (!loytyi) {
            System.out.print("Ei löytynyt.");
        }
    }
}
