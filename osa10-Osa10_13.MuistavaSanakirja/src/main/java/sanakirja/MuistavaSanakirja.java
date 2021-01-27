package sanakirja;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class MuistavaSanakirja {

    private Map<String, String> sanakirja;
    private Map<String, String> enSanakirja;
    private String tiedosto;

    public MuistavaSanakirja() {
        this.sanakirja = new HashMap<>();
        this.enSanakirja = new HashMap<>();
    }

    public MuistavaSanakirja(String tiedosto) {
        this.sanakirja = new HashMap<>();
        this.enSanakirja = new HashMap<>();
        this.tiedosto = tiedosto;
    }

    public void lisaa(String sana, String kaannos) {
        this.sanakirja.putIfAbsent(sana, kaannos);
        this.enSanakirja.putIfAbsent(kaannos, sana);
    }

    public String kaanna(String sana) {
        if (this.sanakirja.containsKey(sana)) {
            return this.sanakirja.get(sana);
        } else if (this.enSanakirja.containsKey(sana)) {
            return this.enSanakirja.get(sana);
        }
        return null;
    }

    public void poista(String sana) {
        if (this.sanakirja.containsKey(sana)) {
            this.enSanakirja.remove(kaanna(sana));
            this.sanakirja.remove(sana);
        } else if (this.enSanakirja.containsKey(sana)) {
            this.sanakirja.remove(this.enSanakirja.get(sana));
            this.enSanakirja.remove(sana);
        }
    }

    public boolean lataa() {
        try {
            Scanner tiedostonlukija = new Scanner(new File(tiedosto));
            while (tiedostonlukija.hasNextLine()) {
                String rivi = tiedostonlukija.nextLine();
                String[] osat = rivi.split(":");
                this.sanakirja.putIfAbsent(osat[0], osat[1]);
                this.enSanakirja.putIfAbsent(osat[1], osat[0]);
            }
            return true;
        } catch (FileNotFoundException e) {
            System.out.print("virhe tapahtui: " + e.toString());
        }
        return false;
    }

    public boolean tallenna() {
        try {
            PrintWriter kirjoittaja = new PrintWriter(this.tiedosto);
            for (String avain : this.sanakirja.keySet()) {
                kirjoittaja.println(avain + ":" + this.sanakirja.get(avain));
            }
            kirjoittaja.close();
            return true;
        } catch (FileNotFoundException e) {
            System.out.print(e.toString());
        }
        return false;
    }
}
