
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TiettyjenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        List<Integer> lista = new ArrayList<>();
        System.out.println("Kirjoita syötteitä, \"loppu\" lopettaa.");
        while (true) {
            String komento = lukija.nextLine();
            if (komento.equals("loppu")) {
                break;
            }
            lista.add(Integer.valueOf(komento));
        }

        System.out.println("Tulostetaanko negatiivisten vai positiivisten "
                + "lukujen keskiarvo?");
        char valinta = lukija.nextLine().charAt(0);
        if (valinta == 'n') {
            System.out.print("Negatiivisten lukujen keskiarvo: "
                    + lista.stream()
                            .mapToDouble(m -> (double) m)
                            .filter(m -> m < 0)
                            .average()
                            .getAsDouble());
        } else {
            System.out.print("Positiivisten lukujen keskiarvo: "
                    + lista.stream()
                            .mapToDouble(m -> (double) m)
                            .filter(m -> m > 0)
                            .average()
                            .getAsDouble());
        }
    }
}
