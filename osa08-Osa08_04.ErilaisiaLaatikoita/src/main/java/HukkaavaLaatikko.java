
import java.util.ArrayList;
import java.util.List;

public class HukkaavaLaatikko extends Laatikko {

    private List<Tavara> sisalto;

    public HukkaavaLaatikko() {
        this.sisalto = new ArrayList<>();

    }

    @Override
    public void lisaa(Tavara tavara) {
        this.sisalto.add(tavara);
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        return false;
    }

}
