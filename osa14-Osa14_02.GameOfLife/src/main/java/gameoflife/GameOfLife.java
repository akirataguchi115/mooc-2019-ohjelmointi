package gameoflife;

import java.util.Random;

public class GameOfLife {

    private int[][] taulukko;

    public GameOfLife(int leveys, int korkeus) {
        this.taulukko = new int[leveys][korkeus];
    }

    public void alustaSatunnaisesti() {
        Random satunnaistaja = new Random();

        int x = 0;
        while (x < taulukko.length) {

            int y = 0;
            while (y < taulukko[x].length) {
                if (satunnaistaja.nextDouble() < 0.2) {
                    taulukko[x][y] = 1;
                }

                y++;
            }
            x++;
        }
    }

    public void kehity() {
        // säännöt kehittymiselle:

        // 1. jokainen elossa oleva alkio, jolla on alle 2 elossa olevaa naapuria kuolee
        // 2. jokainen elossa oleva alkio, jolla on 2 tai 3 elossa olevaa naapuria pysyy hengissä
        // 3. jokainen elossa oleva alkio, jolla on 4 tai enemmän naapureita kuolee
        // 4. jokainen kuollut alkio, jolla on tasan 3 naapuria muuttuu eläväksi
        // taulukossa arvo 1 kuvaa elävää alkiota, arvo 0 kuollutta alkiota
        int[][] kopio = new int[this.taulukko.length][this.taulukko[0].length];
        for (int i = 0; i < this.taulukko.length; i++) {
            for (int j = 0; j < this.taulukko[0].length; j++) {
                int elossa = elossaOleviaNaapureita(taulukko, i, j);
                if (this.taulukko[i][j] == 1 && elossa < 2) {
                    kopio[i][j] = 0;
                } else if (this.taulukko[i][j] == 1 && elossa <= 3) {
                    kopio[i][j] = 1;
                } else if (this.taulukko[i][j] == 1 && elossa > 3) {
                    kopio[i][j] = 0;
                } else if (this.taulukko[i][j] == 0 && elossa == 3) {
                    kopio[i][j] = 1;
                } else {
                    kopio[i][j] = 0;
                }
            }
        }
        this.taulukko = kopio;
    }

    public int[][] getTaulukko() {
        return taulukko;
    }

    public void setTaulukko(int[][] taulukko) {
        this.taulukko = taulukko;
    }

    public int elossaOleviaNaapureita(int[][] taulukko, int x, int y) {
        int elossa = 0;
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                if (x + i >= taulukko.length || x + i < 0 || y + j >= taulukko[1].length || y + j < 0 || (i == 0 && j == 0)) {
                    continue;
                }
                if (taulukko[x + i][y + j] == 1) {
                    elossa++;
                }
            }
        }
        return elossa;
    }
}
