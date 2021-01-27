
import java.util.Scanner;

public class Totuusarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Syötä jotain!");
        boolean totta = Boolean.valueOf(lukija.nextLine());
        System.out.println("Totta vaiko ei? " + totta);
        // toteuta ohjelma tänne
    }
}
