
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PienimmanLuvunIndeksi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta tänne ohjelma, joka lukee käyttäjältä lukuja
        // kunnes käyttäjä syöttää luvun 9999
        // tämän jälkeen ohjelma tulostaa pienimmän luvun
        // sekä sen indeksin -- pienin luku voi esiintyä
        // useammassa indeksissä
        List<Integer> lista = new ArrayList<>();
        while (true) {
            int syote = Integer.valueOf(lukija.nextLine());
            if (syote == 9999) {
                break;
            }
            lista.add(syote);
        }

        int indeksi = 0;
        int pienin = lista.get(0);
        while (indeksi < lista.size()) {
            if (lista.get(indeksi) < pienin) {
                pienin = lista.get(indeksi);
            }
            indeksi++;
        }
        System.out.print("Pienin luku on " + pienin);

        int toinenindeksi = 0;
        while (toinenindeksi < lista.size()) {
            if (lista.get(toinenindeksi) == pienin) {
                System.out.print("Pienin luku löytyy indeksistä "
                        + toinenindeksi);
            }
            toinenindeksi++;
        }
    }
}
