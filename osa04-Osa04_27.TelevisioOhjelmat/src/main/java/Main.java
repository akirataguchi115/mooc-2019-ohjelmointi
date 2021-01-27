
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // toteuta luokkaa TelevisioOhjelma käyttävä ohjelmasi tänne

        ArrayList<TelevisioOhjelma> ohjelmat = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);

        while (true) {
            System.out.print("Nimi: ");
            String nimi = lukija.nextLine();
            if (nimi.isEmpty()) {
                break;
            }
            System.out.print("Pituus: ");
            int pituus = Integer.valueOf(lukija.nextLine());
            ohjelmat.add(new TelevisioOhjelma(nimi, pituus));
        }

        System.out.print("\nOhjelman maksimipituus: ");
        int pituus = Integer.valueOf(lukija.nextLine());
        for (TelevisioOhjelma ohjelma : ohjelmat) {
            if (ohjelma.getPituus() <= pituus) {
                System.out.println(ohjelma.toString());
            }
        }
    }
}
