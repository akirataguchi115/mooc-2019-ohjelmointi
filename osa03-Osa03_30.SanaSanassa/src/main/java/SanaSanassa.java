
import java.util.Scanner;

public class SanaSanassa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna 1. sana: ");
        String sana = lukija.nextLine();
        System.out.print("Anna 2. sana: ");
        String sana2 = lukija.nextLine();

        if (sana.indexOf(sana2) == -1) {
            System.out.print("Sana '" + sana2 + "' ei ole sanan '" + sana
                    + "' osana.");
        } else {
            System.out.print("Sana '" + sana2 + "' on sanan '" + sana + 
                    "' osana.");
        }
    }
}
