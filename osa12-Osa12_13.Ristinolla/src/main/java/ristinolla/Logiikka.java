package ristinolla;

public class Logiikka {

    private String vuoro;
    private String[][] ruudukko;

    public Logiikka() {
        this.vuoro = "X";
        this.ruudukko = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.ruudukko[i][j] = "";
            }
        }
    }

    public String getVuoro() {
        return this.vuoro;
    }

    public boolean saaPelata(int x, int y) {
        return this.ruudukko[x][y].isEmpty();
    }

    public void aseta(int x, int y) {
        this.ruudukko[x][y] = vuoro;
        if (this.vuoro.equals("X")) {
            this.vuoro = "O";
        } else {
            this.vuoro = "X";
        }
    }

    public boolean loppu() {
        if (vertikaaliLoppu() || horisontaaliLoppu() || vinoviistoLoppu() || onTaynna()) {
            return true;
        }
        return false;
    }

    private boolean vertikaaliLoppu() {
        for (int i = 0; i < this.ruudukko.length; i++) {
            int nollia = 0;
            int risteja = 0;
            for (int j = 0; j < this.ruudukko[i].length; j++) {
                if (this.ruudukko[i][j].equals("O")) {
                    nollia++;
                } else if (this.ruudukko[i][j].equals("X")) {
                    risteja++;
                }
            }
            if (nollia == 3 || risteja == 3) {
                return true;
            }
        }
        return false;
    }

    private boolean horisontaaliLoppu() {
        for (int i = 0; i < this.ruudukko.length; i++) {
            int nollia = 0;
            int risteja = 0;
            for (int j = 0; j < this.ruudukko[i].length; j++) {
                if (this.ruudukko[j][i].equals("O")) {
                    nollia++;
                } else if (this.ruudukko[j][i].equals("X")) {
                    risteja++;
                }
            }
            if (nollia == 3 || risteja == 3) {
                return true;
            }
        }
        return false;
    }

    private boolean vinoviistoLoppu() {
        int nollia = 0;
        int risteja = 0;
        for (int i = 0; i < this.ruudukko.length; i++) {
            if (this.ruudukko[i][i].equals("O")) {
                nollia++;
            } else if (this.ruudukko[i][i].equals("X")) {
                risteja++;
            }
            if (nollia == 3 || risteja == 3) {
                return true;
            }
        }
        nollia = 0;
        risteja = 0;
        for (int i = 0; i < this.ruudukko.length; i++) {
            if (this.ruudukko[i][this.ruudukko.length - 1 - i].equals("O")) {
                nollia++;
            } else if (this.ruudukko[i][this.ruudukko.length - 1 - i].equals("X")) {
                risteja++;
            }
            if (nollia == 3 || risteja == 3) {
                return true;
            }
        }
        return false;
    }

    public boolean onTaynna() {
        for (int i = 0; i < this.ruudukko.length; i++) {
            for (int j = 0; j < this.ruudukko.length; j++) {
                if (this.ruudukko[i][j].equals("")) {
                    return false;
                }
            }
        }
        return true;
    }
}
