
import java.util.HashMap;
import java.util.Scanner;

public class Nestesailiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int ensimmainen = 0;
        int toinen = 0;

        while (true) {
            System.out.println("Ensimmäinen: " + ensimmainen + "/100");
            System.out.println("Toinen: " + toinen + "/100");
            System.out.print("> ");

            String luettu = lukija.nextLine();
            System.out.println("");
            if (luettu.equals("lopeta")) {
                break;
            }
            String[] komentoOsat = luettu.split(" ");
            String komento = komentoOsat[0];
            int maara = Integer.valueOf(komentoOsat[1]);
            if (maara < 0) {
                continue;
            }

            switch (komento) {
                case "lisaa":
                    ensimmainen += maara;
                    if (ensimmainen > 100) {
                        ensimmainen = 100;
                    }
                    break;
                case "siirra":
                    if (maara > ensimmainen) {
                        toinen += ensimmainen;
                        ensimmainen = 0;
                    } else {
                        ensimmainen -= maara;
                        toinen += maara;
                    }
                    if (toinen > 100) {
                        toinen = 100;
                    }
                    break;
                case "poista":
                    toinen -= maara;
                    if (toinen < 0) {
                        toinen = 0;
                    }
                    break;
                default:
                    break;
            }

        }
    }
}
