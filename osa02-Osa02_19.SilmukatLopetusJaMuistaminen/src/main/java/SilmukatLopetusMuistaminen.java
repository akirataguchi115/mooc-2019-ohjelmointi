
import java.util.Scanner;

public class SilmukatLopetusMuistaminen {

    public static void main(String[] args) {
        // Kyseessä on yksi iso tehtävä jota koko ajan laajennetaan -- tehtävä
        // on viiden yksittäisen tehtäväpisteen arvoinen

        // Voit halutessasi lähettää osittain tehdyn tehtäväsarjan tarkastettavaksi palvelimelle
        // palvelin valittaa tällöin niistä testeistä joita vastaava koodi ei ole vielä
        // kirjoitettu. Jo tehdyt osat kuitenkin kirjautuvat tehdyiksi.
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä luvut: ");
        int summa = 0;
        int lukuja = 0;
        int parillisia = 0;
        int parittomia = 0;

        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == -1) {
                break;
            }
            summa += luku;
            lukuja++;
            if (luku % 2 == 0) {
                parillisia++;
            } else {
                parittomia++;
            }
        }
        System.out.println("Kiitos ja näkemiin!");
        System.out.println("Summa: " + summa);
        System.out.println("Lukuja: " + lukuja);
        System.out.println("Keskiarvo: " + ((double) summa / (double) lukuja));
        System.out.println("Parillisia: " + parillisia);
        System.out.println("Parittomia: " + parittomia);
    }
}
