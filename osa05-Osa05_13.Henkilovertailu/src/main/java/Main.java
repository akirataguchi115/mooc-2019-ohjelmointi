
public class Main {

    public static void main(String[] args) {
        // voit kirjoittaa testikoodia tänne
        Henkilo eka = new Henkilo("Leevi", new Paivays(1, 1, 2017), 70, 10);
        Henkilo toka = new Henkilo("Leevi", new Paivays(1, 1, 2017), 70, 10);
        if (eka.equals(toka)) {
            System.out.print("boi");
        } else {
            System.out.print("oh ou");
        }

    }
}
