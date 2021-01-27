
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Lukutaitovertailu {

    public static void main(String[] args) {

        try (Scanner tiedostonLukija = new Scanner(new File("lukutaito.csv"))) {
            ArrayList<String[]> lista = new ArrayList<>();
            while (tiedostonLukija.hasNextLine()) {
                String rivi = tiedostonLukija.nextLine();

                String[] palat = rivi.split(",");
                palat[1].trim();
                lista.add(palat);
                palat[2] = palat[2].split(" ")[1];
            }

            lista.stream().sorted((tilasto1, tilasto2) -> {
                return Double.compare(Double.valueOf(tilasto1[5]), Double.valueOf(tilasto2[5]));
            }).forEach(line -> System.out.println(line[3] + " (" + line[4] +  "), " + line[2] + ", " + line[5]));
        } catch (Exception e) {
            System.out.print("ups" + e.toString());
        }
    }
}
