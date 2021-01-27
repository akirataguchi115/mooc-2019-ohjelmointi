
import java.util.Scanner;

public class YkkostenOsuus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int lkm = 0;
        int ykkoset = 0;

        while (true) {
            int luku = Integer.
                    valueOf(lukija.
                            nextLine());
            if (luku == 0) {
                break;
            } else if (luku == 1) {
                ykkoset++;
                lkm++;
            } else {
                lkm++;
            }
        }
        if (lkm < 1) {
            System.out.println("ykkösten osuutta ei voida laskea");
        } else {
            System.out.println((double) ykkoset / (double) lkm);
        }
    }
}
