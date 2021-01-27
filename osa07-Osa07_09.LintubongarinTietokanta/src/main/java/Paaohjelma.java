
import java.util.ArrayList;
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);
        ArrayList<Lintu> linnut = new ArrayList<>();

        boolean jatka = true;
        while (jatka) {
            System.out.print("? ");
            String komento = lukija.nextLine();
            switch (komento) {
                case "Lisaa":
                    System.out.print("Nimi: ");
                    String nimi = lukija.nextLine();
                    System.out.print("Latinankielinen nimi: ");
                    String latinanKielinenNimi = lukija.nextLine();
                    Lintu lintu = new Lintu(nimi, latinanKielinenNimi);
                    linnut.add(lintu);
                    break;
                case "Havainto":
                    System.out.print("Mikä havaittu? ");
                    String havainto = lukija.nextLine();
                    for (Lintu l : linnut) {
                        if (l.getNimi().equals(havainto)) {
                            l.lisaaHavainto();
                        }
                    }
                    break;
                case "Tilasto":
                    linnut.forEach(e -> {
                        System.out.println(e);
                    });
                    break;
                case "Nayta":
                    System.out.print("Mikä? ");
                    String mika = lukija.nextLine();
                    for (Lintu possu : linnut) {
                        if (possu.getNimi().equals(mika)) {
                            System.out.print(possu);
                            break;
                        }
                    }
                    break;
                case "Lopeta":
                    jatka = false;
                    break;
            }
        }
    }

}
