
import java.util.ArrayList;
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> hyvaksytyt = new ArrayList<>();

        System.out.println("Syöte yhteispisteet, -1 lopettaa:");
        boolean jatka = true;
        while (jatka) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == -1) {
                jatka = false;
            }
            if (luku > 100 || luku < 0) {
                continue;
            }
            if (luku >= 50) {
                hyvaksytyt.add(luku);
            }
            lista.add(luku);
        }
        System.out.println("Pisteiden keskiarvo (kaikki): "
                + lista.stream().mapToInt(m -> m).average().getAsDouble());
        if (hyvaksytyt.isEmpty()) {
            System.out.print("Pisteiden keskiarvo (hyvaksytty): -");
        } else {
            System.out.println("Pisteiden keskiarvo (hyväksytyt): "
                    + hyvaksytyt.stream().mapToInt(m -> m).average().getAsDouble());
        }
        System.out.println("Hyväksymisprosentti: "
                + (100.00 * (double)hyvaksytyt.size() 
                        / (double)lista.size()));
        System.out.println("Arvosanajakauma:");
        for (int arvosana = 5; arvosana >= 0; arvosana--) {
            System.out.print(arvosana + ": ");
            for (int pisteet : lista) {
                switch (arvosana) {
                    case 5:
                        if (pisteet >= 90) {
                            System.out.print("*");
                        }
                        break;
                    case 4:
                        if (pisteet >= 80 && pisteet < 90) {
                            System.out.print("*");
                        }
                        break;
                    case 3:
                        if (pisteet >= 70 && pisteet < 80) {
                            System.out.print("*");
                        }
                        break;
                    case 2:
                        if (pisteet >= 60 && pisteet < 70) {
                            System.out.print("*");
                        }
                        break;
                    case 1:
                        if (pisteet >= 50 && pisteet < 60) {
                            System.out.print("*");
                        }
                        break;
                    case 0:
                        if (pisteet < 50) {
                            System.out.print("*");
                        }
                        break;
                    default:
                        System.out.print("*");
                        break;
                }
            }
            System.out.print("\n");
        }
    }
}
