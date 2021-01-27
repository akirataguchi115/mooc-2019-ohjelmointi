
import java.util.Scanner;

public class Tunnussana {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Tunnussana?");
        if (lukija.nextLine().equals("Caput Draconis")) {
            System.out.println("Tervetuloa!");
        } else {
            System.out.println("Hus siitä!");
        }
        // Toteuta ohjelmasi tähän. 
    }
}
