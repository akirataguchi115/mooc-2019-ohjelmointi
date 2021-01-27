
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LuettujenArvojenTulostaminen {
    
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        while (true) {
            String syote = lukija.nextLine();
            if (syote.isEmpty()) {
                break;
            }
            lista.add(syote);
        }
        lista.stream().forEach(syote -> System.out.println(syote));
    }
}
