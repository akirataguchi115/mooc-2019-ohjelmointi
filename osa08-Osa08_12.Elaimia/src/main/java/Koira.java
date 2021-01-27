
public class Koira extends Elain implements Aanteleva{

    private String nimi;

    public Koira(String nimi) {
        super(nimi);
    }

    public Koira() {
        super("koira");
    }

    public void hauku() {
        System.out.println(super.getNimi() + " haukkuu");
    }

    @Override
    public void aantele() {
        hauku();
    }

}
