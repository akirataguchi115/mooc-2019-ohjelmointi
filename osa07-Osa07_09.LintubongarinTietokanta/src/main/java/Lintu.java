
public class Lintu {

    private String nimi;
    private String latinanKielinenNimi;
    private int havaintoja;

    public Lintu(String nimi, String latinanKielinenNimi) {
        this.nimi = nimi;
        this.latinanKielinenNimi = latinanKielinenNimi;
    }

    public String getNimi() {
        return nimi;
    }

    public String getLatinanKielinenNimi() {
        return latinanKielinenNimi;
    }

    public int getHavaintoja() {
        return havaintoja;
    }

    public void lisaaHavainto() {
        this.havaintoja++;
    }

    @Override
    public String toString() {
        return this.nimi + "(" + this.latinanKielinenNimi + "): "
                + this.havaintoja + " havaintoa";
    }
}
