
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LukujenKeskiarvo {
    
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        System.out.print("Kirjoita syötteitä, \"loppu\" lopettaa\n");
        List<Integer> lista = new ArrayList<>();
        while (true) {
            String komento = lukija.nextLine();
            if (komento.equals("loppu")) {
                break;
            }
            lista.add(Integer.valueOf(komento));
        }
        System.out.print("Lukujen keskiarvo: "
                + lista.stream().mapToDouble(m -> (double) m).average().getAsDouble());
    }
}
