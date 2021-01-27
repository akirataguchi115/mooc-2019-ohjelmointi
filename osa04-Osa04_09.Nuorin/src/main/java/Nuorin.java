
import java.util.Scanner;

public class Nuorin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int nuorin = 999999999; //oikeestihan tää voitais tehdä List-oliolla :D
        String nimi = "petteri";

        while (true) {
            String rivi = lukija.nextLine();
            if (rivi.equals("loppu")) {
                break;
            }
            String[] palat = rivi.split(",");

            if (Integer.valueOf(palat[1]) < nuorin) {
                nuorin = Integer.valueOf(palat[1]);
                nimi = palat[0];
            }
        }
        
        System.out.print("Nuorin oli: " + nimi);
    }
}
