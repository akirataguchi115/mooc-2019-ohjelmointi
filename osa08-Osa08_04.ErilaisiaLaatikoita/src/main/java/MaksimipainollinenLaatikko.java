
import java.util.ArrayList;
import java.util.List;

public class MaksimipainollinenLaatikko extends Laatikko {

    private int maksimipaino;
    private List<Tavara> sisalto;

    public MaksimipainollinenLaatikko(int maksimipaino) {
        this.maksimipaino = maksimipaino;
        this.sisalto = new ArrayList<>();
    }

    @Override
    public void lisaa(Tavara tavara) {
        if (this.sisalto.stream().mapToInt(m -> m.getPaino()).sum()
                + tavara.getPaino() > this.maksimipaino) {
            return;
        }
        sisalto.add(tavara);
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        return this.sisalto.contains(tavara);
    }
}
