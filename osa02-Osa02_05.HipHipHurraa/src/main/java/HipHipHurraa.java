
import java.util.Scanner;

public class HipHipHurraa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while (true) {
            if (lukija.nextLine().equals("lopeta")) {
                break;
            }
            System.out.println("hip!");
        }
        System.out.println("hurraa!");
    }
}
