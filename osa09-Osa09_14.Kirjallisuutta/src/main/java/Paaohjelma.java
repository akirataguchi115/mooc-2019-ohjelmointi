
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<Kirja> kirjasto = new ArrayList<>();
        while (true) {
            System.out.print("Syötä kirjan nimi, tyhjä lopettaa: ");
            String nimi = lukija.nextLine();

            if (nimi.isEmpty()) {
                break;
            }
            System.out.print("Syötä kirjan pienin kohdeikä: ");
            int ika = Integer.valueOf(lukija.nextLine());
            kirjasto.add(new Kirja(nimi, ika));
            System.out.println("");
        }
        
        System.out.println("\nYhteensä " + kirjasto.size() + " kirjaa.");
        System.out.println("Kirjat:");
        
        Comparator<Kirja> vertailija = Comparator
                .comparing(Kirja::getIka)
                .thenComparing(Kirja::getNimi);
        Collections.sort(kirjasto, vertailija);
        
        for (Kirja kirja: kirjasto) {
            System.out.println(kirja.getNimi() + "(" + kirja.getIka() + " vuotiaille ja vanhemmille)");
        }
    }
}
