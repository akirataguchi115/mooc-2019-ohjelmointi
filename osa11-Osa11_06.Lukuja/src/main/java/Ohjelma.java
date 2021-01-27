
import java.util.Random;
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Montako satunnaislukua tulostetaan?");
        int moneen = Integer.valueOf(lukija.nextLine());
        for (int i = 0; i < moneen; i++) {
            System.out.println(new Random().nextInt(11));
        }
    }

}
