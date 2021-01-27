package maatila;

import java.util.List;

public class Navetta {

    private Maitosailio maitosailio;
    private Lypsyrobotti lypsyrobotti;

    public Navetta(Maitosailio maitosailio) {
        this.maitosailio = maitosailio;
    }

    public Maitosailio getMaitosailio() {
        return maitosailio;
    }

    public void asennaLypsyrobotti(Lypsyrobotti lypsyrobotti) {
        this.lypsyrobotti = lypsyrobotti;
        this.lypsyrobotti.setMaitosailio(this.maitosailio);
    }

    public void hoida(Lehma lehma) {
        if (this.lypsyrobotti == null) {
            throw new IllegalStateException();
        }
        this.lypsyrobotti.lypsa(lehma);
    }

    public void hoida(List<Lehma> lehmat) throws IllegalStateException {
        if (this.lypsyrobotti == null) {
            throw new IllegalStateException();
        }
        lehmat.forEach(lehma -> {
            this.lypsyrobotti.lypsa(lehma);
        });
    }

    @Override
    public String toString() {
        return this.maitosailio.toString();
    }
}
