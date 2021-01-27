
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // toteuta tänne toiminnallisuus, jonka avulla käyttäjä voi syöttää
        // kirjoja sekä tarkastella niitä
        Scanner lukija = new Scanner(System.in);
        ArrayList<Kirja> lista = new ArrayList<>();

        boolean jatka = true;
        while (jatka) {
            System.out.print("Nimi: ");
            String nimi = lukija.nextLine();
            if (nimi.isEmpty()) {
                jatka = false;
                continue;
            }
            System.out.print("Sivuja: ");
            int sivuja = Integer.valueOf(lukija.nextLine());
            System.out.print("Kirjoitusvuosi: ");
            int vuosi = Integer.valueOf(lukija.nextLine());
            lista.add(new Kirja(nimi, sivuja, vuosi));
        }

        System.out.print("\nMitä tulostetaan: ");
        String komento = lukija.nextLine();
        if (komento.equals("kaikki")) {
            for (Kirja kirja : lista) {
                System.out.println(kirja.toString());
            }
        } else if (komento.equals("nimi")) {
            for (Kirja k : lista) {
                System.out.println(k.getNimi());
            }
        }
    }
}
