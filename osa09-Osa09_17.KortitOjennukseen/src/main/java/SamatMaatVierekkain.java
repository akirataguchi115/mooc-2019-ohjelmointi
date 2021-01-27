
import java.util.Comparator;

public class SamatMaatVierekkain implements Comparator<Kortti> {

    @Override
    public int compare(Kortti o1, Kortti o2) {
        return o1.getMaa().ordinal() - o2.getMaa().ordinal();
    }

}
