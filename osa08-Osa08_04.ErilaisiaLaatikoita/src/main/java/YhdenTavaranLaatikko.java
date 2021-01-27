
import java.util.ArrayList;
import java.util.List;

public class YhdenTavaranLaatikko extends Laatikko {

    private List<Tavara> lista;

    public YhdenTavaranLaatikko() {
        this.lista = new ArrayList<>();
    }

    @Override
    public void lisaa(Tavara tavara) {
        if (this.lista.size() == 0) {
            this.lista.add(tavara);
        }
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        return this.lista.contains(tavara);
    }
}
