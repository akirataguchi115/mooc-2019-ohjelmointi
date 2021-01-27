
import java.io.File;
import java.util.Scanner;

public class KysytynTiedostonTulostaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Minkä tiedoston sisältö tulostetaan?\n");
        String tiedosto = lukija.nextLine();
        try (Scanner tiedostonLukija = new Scanner(new File(tiedosto))) {

            while (tiedostonLukija.hasNextLine()) {
                
                String line = tiedostonLukija.nextLine();
                System.out.print(line + "\n");
            }
        } catch (Exception e) {
            System.out.print("virhe: " + e.getMessage());
        }

    }
}
