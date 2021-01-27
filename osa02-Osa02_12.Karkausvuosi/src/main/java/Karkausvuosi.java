
import java.util.Scanner;

public class Karkausvuosi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Anna vuosi: ");
        int vuosi = Integer.valueOf(lukija.nextLine());
        if (vuosi % 100 == 0) {
            if (vuosi % 400 == 0) {
                System.out.println("Vuosi on karkausvuosi.");
            } else {
                System.out.println("Vuosi ei ole karkausvuosi.");
            }
        } else if (vuosi % 4 == 0) {
            System.out.println("Vuosi on karkausvuosi.");
        } else {
            System.out.println("Vuosi ei ole karkausvuosi.");
        }
    }
}
