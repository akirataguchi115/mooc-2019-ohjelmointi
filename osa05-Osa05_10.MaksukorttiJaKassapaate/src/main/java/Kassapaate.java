
public class Kassapaate {

    private double rahaa;  // kassassa olevan käteisen määrä
    private int edulliset; // myytyjen edullisten lounaiden määrä
    private int maukkaat;  // myytyjen maukkaiden lounaiden määrä

    public Kassapaate() {
        this.rahaa = 1000.00;
        this.edulliset = 0;
        this.maukkaat = 0;
        // kassassa on aluksi 1000 euroa rahaa
    }

    public double syoEdullisesti(double maksu) {
        if (maksu - 2.50 >= 0) {
            this.rahaa += 2.50;
            this.edulliset++;
            return maksu - 2.50;
        }
        return maksu;
    }

    public double syoMaukkaasti(double maksu) {
        if (maksu - 4.30 >= 0) {
            this.rahaa += 4.30;
            this.maukkaat++;
            return maksu - 4.30;
        }
        return maksu;
    }

    public boolean syoEdullisesti(Maksukortti kortti) {
        if (kortti.otaRahaa(2.50)) {
            this.edulliset++;
            return true;
        }
        return false;
    }

    public boolean syoMaukkaasti(Maksukortti kortti) {
        if (kortti.otaRahaa(4.30)) {
            this.maukkaat++;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "kassassa rahaa " + rahaa + " edullisia lounaita myyty "
                + edulliset + " maukkaita lounaita myyty " + maukkaat;
    }

    public void lataaRahaaKortille(Maksukortti kortti, double summa) {
        if (summa > 0) {
            this.rahaa += summa;
            kortti.lataaRahaa(summa);
        }
    }
}
