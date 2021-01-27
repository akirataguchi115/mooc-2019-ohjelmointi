
import java.io.File;
import java.util.Scanner;

public class TiedostonTulostaminen {

    public static void main(String[] args) {

        try (Scanner tiedostonLukija = new Scanner(new File("data.txt"))) {

            while (tiedostonLukija.hasNextLine()) {
                String rivi = tiedostonLukija.nextLine();
                System.out.print(rivi);
            }
        } catch (Exception e) {
            System.out.println("virhe " + e.getMessage());
        }
    }
}
