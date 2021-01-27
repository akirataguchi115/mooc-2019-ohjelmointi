
public class Kuutio {

    private int sarma;

    public Kuutio(int sarmanPituus) {
        this.sarma = sarmanPituus;
    }

    public int tilavuus() {
        return sarma * sarma * sarma;
    }

    @Override
    public String toString() {
        return "Kuution särmän pituus on " + sarma + ", tilavuus on " + 
                tilavuus();
    }
}
