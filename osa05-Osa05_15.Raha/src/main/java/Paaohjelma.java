
public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne koodia jolla testaat ohjelmoimasi luokan toimintaa
        Raha r1 = new Raha(1, 0);
        Raha r2 = new Raha(1, 50);
        Raha r3 = new Raha(-3, 5);
        Raha r4 = new Raha(2, 0);
        System.out.print(r1.vahemman(r3));
    }
}
