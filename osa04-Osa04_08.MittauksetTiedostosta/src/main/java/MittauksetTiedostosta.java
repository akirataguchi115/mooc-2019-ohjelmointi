
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MittauksetTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Tiedosto? ");
        String tiedosto = lukija.nextLine();
        System.out.print("Alaraja? ");
        int alaraja = Integer.valueOf(lukija.nextLine());
        System.out.print("Yläraja? ");
        int ylaraja = Integer.valueOf(lukija.nextLine());
        int lukuja = 0;

        try (Scanner tiedostonLukija = new Scanner(new File(tiedosto))) {
            while (tiedostonLukija.hasNext()) {
                int luku = Integer.valueOf(tiedostonLukija.nextLine());
                if (luku <= ylaraja && luku >= alaraja) {
                    lukuja++;
                }
            }
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
        System.out.print("Lukuja: " + lukuja);
    }

}
