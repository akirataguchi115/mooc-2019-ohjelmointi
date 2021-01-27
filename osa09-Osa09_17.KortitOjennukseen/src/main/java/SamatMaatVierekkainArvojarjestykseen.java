
import java.util.Comparator;

public class SamatMaatVierekkainArvojarjestykseen implements Comparator<Kortti> {

    @Override
    public int compare(Kortti o1, Kortti o2) {
        if (o1.getMaa() == o2.getMaa()) {
            return o1.getArvo() - o2.getArvo();
        }
        return o1.getMaa().ordinal() - o2.getMaa().ordinal();
    }
}
