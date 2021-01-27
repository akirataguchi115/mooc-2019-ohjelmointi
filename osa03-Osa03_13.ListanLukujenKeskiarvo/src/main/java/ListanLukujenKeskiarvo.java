
import java.util.ArrayList;
import java.util.Scanner;

public class ListanLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        int summa = 0;
        while (true) {
            int syote = Integer.valueOf(lukija.nextLine());
            if (syote == -1) {
                break;
            }
            lista.add(syote);
            summa += syote;
        }
        System.out.print("Keskiarvo: " + ((double) summa / (double) lista.size()));
        // toteuta tänne ohjelma, joka ensin lukee käyttäjältä
        // lukuja listalle kunnes käyttäjä syöttää luvun -1.
        // ohjelma laskee tämän jälkeen listalla olevien lukujen
        // keskiarvon, ja tulostaa sen käyttäjän näkyville
    }
}
