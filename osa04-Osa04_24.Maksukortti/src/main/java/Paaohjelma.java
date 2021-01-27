
public class Paaohjelma {

    public static void main(String[] args) {
        // Scanner lukija = new Scanner(System.in);

        Maksukortti pekka = new Maksukortti(20);
        Maksukortti matti = new Maksukortti(30);
        pekka.syoMaukkaasti();
        matti.syoEdullisesti();
        System.out.println("Pekka: " + pekka);
        System.out.print("Matti: " + matti + "\n");
        pekka.lataaRahaa(20);
        matti.syoMaukkaasti();
        System.out.println("Pekka: " + pekka);
        System.out.println("Matti: " + matti);
        pekka.syoEdullisesti();
        pekka.syoEdullisesti();
        matti.lataaRahaa(50);
        System.out.println("Pekka: " + pekka);
        System.out.println("Matti: " + matti);
    }
}
