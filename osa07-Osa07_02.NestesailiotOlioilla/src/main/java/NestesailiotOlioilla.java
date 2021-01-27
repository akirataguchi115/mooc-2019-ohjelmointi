
import java.util.Scanner;

public class NestesailiotOlioilla {

    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);
        Sailio ensimmainen = new Sailio();
        Sailio toinen = new Sailio();

        while (true) {
            System.out.println("Ensimmäinen: " + ensimmainen);
            System.out.println("Toinen: " + toinen);
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
                    ensimmainen.lisaa(maara);
                    break;
                case "siirra":
                    if (ensimmainen.sisalto() < maara) {
                        toinen.lisaa(ensimmainen.sisalto());
                        ensimmainen.poista(maara);
                    } else {
                        toinen.lisaa(maara);
                        ensimmainen.poista(maara);
                    }
                    break;
                case "poista":
                    toinen.poista(maara);
                    break;
                default:
                    break;
            }

        }

    }

}
