package testausta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        suorita(lukija);
    }

    public static String suorita(Scanner lukija) {
        List<Integer> pullot = new ArrayList<>();
        while (true) {
            String komento = lukija.nextLine();
            if (komento.equals("-1")) {
                break;
            }
            int luku = Integer.valueOf(komento);
            if (luku < 0) {
                continue;
            }
            pullot.add(luku);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Pulloja: " + pullot.stream().mapToInt(m -> m).sum() + "\nOppilaita: " + pullot.size() + "\n");
        if (pullot.size() == 0) {
            sb.append("Keskiarvoa ei voida laskea");
        } else {
            sb.append("Keskiarvo: " + pullot.stream().mapToInt(m -> m).average().getAsDouble());
        }
        return sb.toString();
    }
}
