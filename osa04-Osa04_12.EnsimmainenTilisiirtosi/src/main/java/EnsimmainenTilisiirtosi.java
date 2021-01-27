
public class EnsimmainenTilisiirtosi {

    public static void main(String[] args) {
        // Tili.Java:ssa olevaan koodiin ei tule koskea
        // tee ohjelmasi tänne
        Tili matti = new Tili("Matin tili", 1000);
        Tili oma = new Tili("Omati", 0);
        matti.otto(100);
        oma.pano(100);
        System.out.print(matti);
        System.out.print(oma);
    }
}
