
import java.util.Scanner;

public class LukujenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int lkm = 0;

        while (true) {
            System.out.println("Syötä luku");
            if(Integer.valueOf(lukija.nextLine()) == 0) {
                break;
            }
            lkm++;
        }
        System.out.println("Lukuja yhteensä " + lkm);
    }
}
