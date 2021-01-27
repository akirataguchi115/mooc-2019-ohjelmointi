
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tyontekijat {

    private List<Henkilo> tyontekijat;

    public Tyontekijat() {
        this.tyontekijat = new ArrayList<>();
    }

    public void lisaa(Henkilo lisattava) {
        this.tyontekijat.add(lisattava);
    }

    public void lisaa(List<Henkilo> lisattavat) {
        Iterator<Henkilo> iteraattori = lisattavat.iterator();

        while (iteraattori.hasNext()) {
            this.tyontekijat.add(iteraattori.next());
        }
    }

    public void tulosta() {
        Iterator<Henkilo> iteraattori = this.tyontekijat.iterator();
        while (iteraattori.hasNext()) {
            System.out.println(iteraattori.next());
        }
    }

    public void tulosta(Koulutus koulutus) {
        Iterator<Henkilo> iteraattori = this.tyontekijat.iterator();

        while (iteraattori.hasNext()) {
            Henkilo valimuuttuja = iteraattori.next();
            if (valimuuttuja.getKoulutus() == koulutus) {
                System.out.println(valimuuttuja);
            }
        }
    }

    public void irtisano(Koulutus koulutus) {
        Iterator<Henkilo> pellehermanni = this.tyontekijat.iterator();
        while (pellehermanni.hasNext()) {
            Henkilo valimuuttuja = pellehermanni.next();
            if (valimuuttuja.getKoulutus() == koulutus) {
                pellehermanni.remove();
            }
        }
    }
}
