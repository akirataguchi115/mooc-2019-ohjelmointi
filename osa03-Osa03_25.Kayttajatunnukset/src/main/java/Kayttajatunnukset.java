
import java.util.Scanner;

public class Kayttajatunnukset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna tunnus: ");
        String tunnus = lukija.nextLine();
        System.out.print("Anna salasana: ");
        String salasana = lukija.nextLine();
        if (tunnus.equals("aleksi") && salasana.equals("tappara")) {
            System.out.print("Olet kirjautunut järjestelmään");
        } else if (tunnus.equals("elina") && salasana.equals("kissa")) {
            System.out.print("Olet kirjautunut järjestelmään");
        } else {
            System.out.print("Virheellinen tunnus tai salasana!");
        }
    }
}
