
import java.util.Scanner;

public class RajatunLukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Ensimmäinen: ");
        int eka = Integer.valueOf(lukija.nextLine());
        System.out.print("Viimeinen: ");
        int vika = Integer.valueOf(lukija.nextLine());
        int summa = 0;
        
         for (int i = eka; i <= vika; i++) {
            summa += i;
        }
        System.out.print("Summa on " + summa);
    }
}
