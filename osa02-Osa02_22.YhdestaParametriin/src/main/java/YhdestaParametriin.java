
import java.util.Scanner;

public class YhdestaParametriin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
    }

    public static void tulostaLukuunAsti(int luku) {
        int alku = 1;
        while (true) {
            if (luku < alku) {
                break;
            }
            System.out.print(alku + "\n");
            alku++;
        }
    }

}
