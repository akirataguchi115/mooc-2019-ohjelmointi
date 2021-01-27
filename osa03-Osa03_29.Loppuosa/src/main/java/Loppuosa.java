import java.util.Scanner;

public class Loppuosa {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna sana: ");
        String sana = lukija.nextLine();
        System.out.print("Loppuosan pituus: ");
        int loppuosa = Integer.valueOf(lukija.nextLine());
        System.out.print("Tulos: " + sana.substring(sana.length() - loppuosa, sana.length()));
    }
}
