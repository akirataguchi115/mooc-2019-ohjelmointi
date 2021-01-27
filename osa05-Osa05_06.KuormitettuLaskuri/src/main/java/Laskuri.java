
public class Laskuri {

    private int luku;

    public Laskuri(int alkuarvo) {
        this.luku = alkuarvo;
    }

    public Laskuri() {
        this(0);
    }

    public int arvo() {
        return luku;
    }

    public void lisaa() {
        lisaa(1);
    }

    public void vahenna() {
        vahenna(1);
    }

    public void lisaa(int lisays) {
        if (lisays < 0) {
            return;
        } else {
            luku += lisays;
        }
    }

    public void vahenna(int vahennys) {
        if (vahennys >= 0) {
            luku -= vahennys;
        }
    }

}
