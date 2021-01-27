
import java.util.ArrayList;
import java.util.Scanner;

public class HenkilotietojenTarkastelu {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        String pisin = "";
        int summa = 0;
        int yhteensa = 0;

        while (true) {
            String syote = lukija.nextLine();
            if (syote.isEmpty()) {
                break;
            }
            String[] palat = syote.split(",");
            if (palat[0].length() > pisin.length()) {
                pisin = palat[0];
            }
            summa += Integer.valueOf(palat[1]);
            yhteensa++;
        }
        System.out.print("Pisin nimi: " + pisin);
        System.out.print("Syntymävuosien keskiarvo: " + ((double)summa
                / (double)yhteensa));
    }
}
