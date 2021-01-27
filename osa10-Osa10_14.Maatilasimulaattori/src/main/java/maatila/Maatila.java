package maatila;

import java.util.ArrayList;
import java.util.List;

public class Maatila implements Eleleva {

    private String omistaja;
    private List<Lehma> lehmat;
    private Navetta navetta;

    public Maatila(String omistaja, Navetta navetta) {
        this.omistaja = omistaja;
        this.lehmat = new ArrayList<>();
        this.navetta = navetta;
    }

    public String getOmistaja() {
        return omistaja;
    }

    public void lisaaLehma(Lehma lehma) {
        this.lehmat.add(lehma);
    }

    @Override
    public String toString() {
        if (this.lehmat.isEmpty()) {
            return "Maatilan omistaja: " + getOmistaja()
                    + "\nNavetan maitosäiliö: " + this.navetta.getMaitosailio().toString()
                    + "\nEi lehmiä.";
        }
        String teksti = "Maatilan omistaja: " + getOmistaja()
                + "\nNavetan maitosäiliö: " + this.navetta.getMaitosailio().toString();
        StringBuilder sb = new StringBuilder();
        sb.append(teksti);
        lehmat.forEach(lehma -> {
            sb.append(lehma.toString() + "\n");
        });
        return sb.toString();
    }

    @Override
    public void eleleTunti() {
        lehmat.forEach(lehma -> lehma.eleleTunti());
    }

    public void hoidaLehmat() {
        this.navetta.hoida(lehmat);
    }

    public void asennaNavettaanLypsyrobotti(Lypsyrobotti robo) {
        this.navetta.asennaLypsyrobotti(robo);
    }
}
