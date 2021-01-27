
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Kasi implements Comparable<Kasi> {

    private List<Kortti> kasi;

    public Kasi() {
        this.kasi = new ArrayList<>();
    }

    public void lisaa(Kortti kortti) {
        this.kasi.add(kortti);
    }

    public void tulosta() {
        Iterator<Kortti> korttiiterator = this.kasi.iterator();
        while (korttiiterator.hasNext()) {
            System.out.println(korttiiterator.next());
        }
    }

    public void jarjesta() {
        Collections.sort(kasi);
    }

    public int arvo() {
        return this.kasi.stream().mapToInt(m -> m.getArvo()).sum();
    }

    @Override
    public int compareTo(Kasi o) {
        return this.arvo() - o.arvo();
    }

    public void jarjestaMaittain() {
        this.kasi.sort(new SamatMaatVierekkainArvojarjestykseen());
    }
}
