
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RajatutLuvut {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku < 0) {
                break;
            }
            lista.add(luku);
        }
        lista.stream().filter(luku -> luku < 6 && luku > 0)
                .forEach(luku -> System.out.println(luku));
    }
}
