package hiekkaranta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Simulaatio {

    private Tyyppi[][] taulukko;

    public Simulaatio(int leveys, int korkeus) {
        this.taulukko = new Tyyppi[leveys][korkeus];
        for (int i = 0; i < leveys; i++) {
            for (int j = 0; j < korkeus; j++) {
                lisaa(i, j, Tyyppi.TYHJA);
            }
        }
    }

    public void lisaa(int x, int y, Tyyppi tyyppi) {
        if (sisalto(x, y) == Tyyppi.METALLI) {
            return;
        }
        this.taulukko[x][y] = tyyppi;
    }

    public Tyyppi sisalto(int x, int y) {
        if (x < 0 || x >= this.taulukko.length || y < 0 || y >= this.taulukko[0].length) {
            return Tyyppi.METALLI;
        }
        return this.taulukko[x][y];
    }

    public void paivita() {
        for (int x = 0; x < this.taulukko.length; x++) {
            for (int y = this.taulukko[0].length - 1; y > 0; y--) {
                if (this.taulukko[x][y] == Tyyppi.TYHJA) {
                    continue;
                }

                if (this.taulukko[x][y] == Tyyppi.METALLI) {
                    continue;
                }

                if (this.taulukko[x][y] == Tyyppi.HIEKKA) {
                    siirraHiekkaa(x, y);
                    continue;
                }

                if (this.taulukko[x][y] == Tyyppi.VESI) {
                    siirraVetta(x, y);
                    continue;
                }
            }

        }
    }

    public boolean hiekkaSyrjayttaa(int x, int y) {
        if (x < 0 || y < 0 || x >= this.taulukko.length || y >= this.taulukko[0].length) {
            return false;
        }

        if (this.taulukko[x][y] == Tyyppi.TYHJA) {
            return true;
        }

        if (this.taulukko[x][y] == Tyyppi.VESI) {
            return true;
        }

        return false;
    }

    public boolean vesiSyrjayttaa(int x, int y) {
        if (x < 0 || y < 0 || x >= this.taulukko.length || y >= this.taulukko[0].length) {
            return false;
        }

        if (this.taulukko[x][y] == Tyyppi.TYHJA) {
            return true;
        }

        return false;
    }

    private void siirraHiekkaa(int x, int y) {
        List<Piste> vapaatAlla = kohdatAltaJoissa(x, y, Tyyppi.TYHJA, Tyyppi.VESI);
        if (vapaatAlla.isEmpty()) {
            return;
        }

        vaihdaSatunnaiseen(vapaatAlla, x, y);
    }

    private void siirraVetta(int x, int y) {
        List<Piste> vapaatAlla = kohdatAltaJoissa(x, y, Tyyppi.TYHJA);
        if (!vapaatAlla.isEmpty()) {
            vaihdaSatunnaiseen(vapaatAlla, x, y);
            return;
        }

        // katsotaan voiko mennä oikealle tai vasemmalle
        if (sisalto(x + 1, y) == Tyyppi.TYHJA) {
            vapaatAlla.add(new Piste(x + 1, y));
        }
        if (sisalto(x - 1, y) == Tyyppi.TYHJA) {
            vapaatAlla.add(new Piste(x - 1, y));
        }

        if (!vapaatAlla.isEmpty()) {
            vaihdaSatunnaiseen(vapaatAlla, x, y);
        }
    }

    private void vaihdaSatunnaiseen(List<Piste> vapaatAlla, int x, int y) {
        Collections.shuffle(vapaatAlla);
        Piste vaihtokohta = vapaatAlla.get(0);
        Tyyppi jemma = this.taulukko[x][y];
        this.taulukko[x][y] = this.taulukko[vaihtokohta.getX()][vaihtokohta.getY()];
        this.taulukko[vaihtokohta.getX()][vaihtokohta.getY()] = jemma;
    }

    public List<Piste> kohdatAltaJoissa(int x, int y, Tyyppi... tyypit) {
        List<Piste> kohdat = new ArrayList<>();

        for (int xMuutos = -1; xMuutos <= 1; xMuutos++) {
            Tyyppi sisalto = sisalto(x + xMuutos, y + 1);

            boolean loytyi = false;
            for (int i = 0; i < tyypit.length; i++) {
                Tyyppi tyyppi = tyypit[i];
                if (sisalto == tyyppi) {
                    loytyi = true;
                    break;
                }
            }

            if (loytyi) {
                kohdat.add(new Piste(x + xMuutos, y + 1));
            }
        }

        return kohdat;
    }
}
