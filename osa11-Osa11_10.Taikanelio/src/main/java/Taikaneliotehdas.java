
public class Taikaneliotehdas {

    public Taikanelio luoTaikanelio(int koko) {

        Taikanelio nelio = new Taikanelio(koko);

        int i = 1;
        int x = (koko - 1) / 2;
        int y = 0;
        boolean jatka = true;
        nelio.asetaArvo(x, y, i);
        i++;

        while (jatka) {
            if (onkoTaynna(nelio)) {
                jatka = false;
                continue;
            }

            //suunnitellut x ja y
            if (x + 1 >= nelio.getLeveys()) {
                x = 0;
            } else {
                x++;
            }
            if (y - 1 < 0) {
                y = nelio.getKorkeus() - 1;
            } else {
                y--;
            }

            //jos varattu, siirry alas
            if (nelio.annaArvo(x, y) != 0) {
                y += 2;
                x--;
                if (x < 0) {
                    x = nelio.getLeveys() - 1;
                }
                if (y == nelio.getKorkeus()) {
                    y = 0;
                } else if (y == nelio.getKorkeus() + 1) {
                    y = 1;
                }
            }

            nelio.asetaArvo(x, y, i);
            i++;
            System.out.print(nelio + "\n\n");
        }
        // toteuta taikaneliön luominen Siamese method -algoritmilla tänne
        return nelio;
    }

    public boolean onkoTaynna(Taikanelio nelio) {
        for (int x = 0; x < nelio.getLeveys(); x++) {
            for (int y = 0; y < nelio.getKorkeus(); y++) {
                if (nelio.annaArvo(x, y) == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
