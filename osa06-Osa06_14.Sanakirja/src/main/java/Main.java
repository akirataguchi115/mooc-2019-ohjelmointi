
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Tekstikayttoliittyma t = new Tekstikayttoliittyma(new Scanner(System.in), new Sanakirja());
        t.kaynnista();
    }
}
