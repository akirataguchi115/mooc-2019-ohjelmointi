
import java.util.Scanner;

public class ArvosanatJaPisteet {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna pisteet [0-100]:");
        int pisteet = Integer.valueOf(lukija.nextLine());
        if (pisteet > 100) {
            System.out.println("Arvosana: uskomatonta!");
        } else if (pisteet >= 90) {
            System.out.println("Arvosana: 5");
        } else if (pisteet >= 80) {
            System.out.println("Arvosana: 4");
        } else if (pisteet >= 70) {
            System.out.println("Arvosana: 3");
        } else if (pisteet >= 60) {
            System.out.println("Arvosana: 2");
        } else if (pisteet >= 50) {
            System.out.println("Arvosana: 1");
        } else if (pisteet >= 0) {
            System.out.println("hylätty");
        } else {
            System.out.println("mahdotonta!");
        }
    }

}
