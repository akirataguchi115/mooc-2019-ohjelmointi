package maatila;

import java.util.Random;

public class Lehma implements Lypsava, Eleleva {

    private String nimi;
    private double tilavuus;
    private double maara;
    private static final String[] NIMIA = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Matti", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    public Lehma() {
        this.tilavuus = 15 + new Random().nextInt(26);
        this.maara = 0;
        this.nimi = NIMIA[new Random().nextInt(NIMIA.length)];
    }

    public Lehma(String nimi) {
        this.tilavuus = 15 + new Random().nextInt(26);
        this.nimi = nimi;
        this.maara = 0;
    }

    public String getNimi() {
        return nimi;
    }

    public double getTilavuus() {
        return tilavuus;
    }

    public double getMaara() {
        return maara;
    }

    @Override
    public String toString() {
        return this.nimi + " " + Math.ceil(this.maara) + "/" + Math.ceil(this.tilavuus);
    }

    @Override
    public double lypsa() {
        Double maara = this.maara;
        this.maara = 0;
        return maara;

    }

    @Override
    public void eleleTunti() {
        this.maara += new Random().nextDouble() + 0.7;
        if (this.maara > this.tilavuus) {
            this.maara = this.tilavuus;
        }
    }
}
