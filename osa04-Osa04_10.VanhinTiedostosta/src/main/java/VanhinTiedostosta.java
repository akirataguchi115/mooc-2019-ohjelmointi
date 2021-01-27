
import java.io.File;
import java.util.Scanner;

public class VanhinTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Mikä tiedosto luetaan?\n");
        String tiedosto = lukija.nextLine();
        int vanhin = 0;
        String nimi = "lkasdjlfajsdlköfj";

        try (Scanner tiedostonLukija = new Scanner(new File(tiedosto))) {
            while (tiedostonLukija.hasNext()) {
                String rivi = tiedostonLukija.nextLine();
                String[] parts = rivi.split(",");
                if (vanhin < Integer.valueOf(parts[1])) {
                    vanhin = Integer.valueOf(parts[1]);
                    nimi = parts[0];
                }
            }
        } catch (Exception e) {
            System.out.print("exception in scanner tiedostonlukija: "
                    + e.getMessage());
        }
        
        System.out.print("Vanhin oli " + nimi);
    }
}
