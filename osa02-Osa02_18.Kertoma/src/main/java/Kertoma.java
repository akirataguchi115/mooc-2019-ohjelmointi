
import java.util.Scanner;

public class Kertoma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna luku: ");
        int luku = Integer.valueOf(lukija.nextLine());
        int summa = 1;

        for (int i = 1; i <= luku; i++) {
            summa *= i;
        }
        System.out.print("Summa on " + summa);

    }
}
