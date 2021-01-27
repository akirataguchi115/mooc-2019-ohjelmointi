
import java.util.Scanner;

public class Tarina {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Kerron kohta tarinan, mutta "
                + "tarvitsen siihen hieman tietoja.\nMinkä niminen "
                + "tarinassa esiintyvä hahmo on?");
        String kuka = lukija.nextLine();
        System.out.println("Mikä hahmon ammatti on?");
        String ammatti = lukija.nextLine();
        System.out.println("Tässä tarina:\nOlipa kerran " + kuka
                + ", joka oli ammatiltaan " + ammatti + ".");
        System.out.println("Matkatessaan töihin, " + kuka + " mietti "
                + "arkeaan. Kun työnä\non " + ammatti + ", tekemistä"
                + " riittää välillä hyvin paljon ja\n"
                + "välillä ei lainkaan. Ehkäpä " + kuka
                + " ei olekaan koko\nelämäänsä " + ammatti + ".");
        // toteuta ohjelma tänne
    }
}
