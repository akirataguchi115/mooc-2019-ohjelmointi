
import java.util.HashMap;
import java.util.Scanner;

public class Tekstikayttoliittyma {
    
    private Scanner lukija;
    private Sanakirja sanakirja;
    
    public Tekstikayttoliittyma(Scanner lukija, Sanakirja sanakirja) {
        this.lukija = lukija;
        this.sanakirja = sanakirja;
    }
    
    public void kaynnista() {
        System.out.print("Komennot:\n");
        System.out.println("lopeta - poistuu käyttöliittymästä");
        System.out.println("kaanna - kysyy sanan ja tulostaan sen käännöksen");
        System.out.println("lopeta - poistuu käyttöliittymästä\n");
        boolean jatka = true;
        while (jatka) {
            System.out.print("Komento: ");
            String komento = lukija.nextLine();
            
            switch (komento) {
                case "lopeta":
                    jatka = false;
                    System.out.print("Hei hei!");
                    continue;
                case "lisaa":
                    System.out.print("Suomeksi: ");
                    String suomeksi = lukija.nextLine();
                    System.out.print("Käännös: ");
                    String kaannos = lukija.nextLine();
                    this.sanakirja.lisaa(suomeksi, kaannos);
                    break;
                case "kaanna":
                    System.out.print("Anna sana: ");
                    String sana = lukija.nextLine();
                    System.out.println(this.sanakirja.kaanna(sana));
                    break;
                default:
                    System.out.print("Tuntematon komento\n");
            }
        }
    }
}
