
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reseptihaku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<Resepti> reseptit = new ArrayList<>();
        System.out.print("Mistä luetaan? ");
        String mista = lukija.nextLine();

        try (Scanner tiedostonLukija = new Scanner(new File(mista))) {
            while (tiedostonLukija.hasNextLine()) {
                String nimi = tiedostonLukija.nextLine();
                Resepti resepti = new Resepti();
                resepti.setNimi(nimi);
                int keittoaika = Integer.valueOf(tiedostonLukija.nextLine());
                resepti.setKeittoaika(keittoaika);

                boolean jatka = true;
                while (jatka) {
                    if (!tiedostonLukija.hasNextLine()) {
                        jatka = false;
                        continue;
                    }
                    String raakaAine = tiedostonLukija.nextLine();
                    if (raakaAine.isEmpty()) {
                        jatka = false;
                        continue;
                    }

                    resepti.lisaaRaakaAine(raakaAine);
                }
                reseptit.add(resepti);
            }
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
        System.out.println("\nKomennot:\n"
                + "listaa - listaa reseptit\n"
                + "lopeta - lopettaa ohjelman\n"
                + "hae nimi - hakee reseptiä nimen perusteella\n"
                + "hae keittoaika - hakee reseptiä keittoajan perusteella\n"
                + "hae aine - hakee reseptiä raaka-aineen perusteella\n");

        boolean jatka = true;
        while (jatka) {
            System.out.print("Syötä komento: ");
            String komento = lukija.nextLine();
            switch (komento) {
                case "listaa":
                    System.out.print("\n");
                    System.out.println("Reseptit:");
                    reseptit.forEach(resepti -> System.out.println(resepti));
                    System.out.print("\n");
                    break;
                case "hae nimi":
                    System.out.print("Mitä haetaan: ");
                    String nimi = lukija.nextLine();
                    System.out.println("\nReseptit:");
                    for (Resepti resepti : reseptit) {
                        if (resepti.getNimi().contains(nimi)) {
                            System.out.println(resepti);
                        }
                    }
                    System.out.print("\n");
                    break;
                case "hae keittoaika":
                    System.out.print("Keittoaika korkeintaan: ");
                    int korkeintaan = Integer.valueOf(lukija.nextLine());
                    System.out.println("\nReseptit:");
                    for (Resepti resepti : reseptit) {
                        if (resepti.getKeittoaika() <= korkeintaan) {
                            System.out.println(resepti);
                        }
                    }
                    System.out.print("\n");
                    break;
                case "hae aine":
                    System.out.print("Mitä raaka-ainetta haetaan: ");
                    String raakis = lukija.nextLine();
                    System.out.println("\nReseptit:");
                    for (Resepti resepti : reseptit) {
                        if (resepti.getRaakaAineet().contains(raakis)) {
                            System.out.println(resepti);
                        }
                    }
                    System.out.print("\n");
                    break;
                case "lopeta":
                    jatka = false;
                    break;
            }
        }
    }

}
