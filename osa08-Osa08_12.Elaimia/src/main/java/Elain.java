
public abstract class Elain {

    private String nimi;

    public Elain(String nimi) {
        this.nimi = nimi;
    }

    public String getNimi() {
        return nimi;
    }

    public void syo() {
        System.out.println(this.nimi + " syo");
    }

    public void nuku() {
        System.out.println(this.nimi + " nukkuu");
    }
}
