
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiivisetLuvut {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // testaa metodia täällä

    }

    public static List<Integer> positiiviset(List<Integer> luvut) {
        List<Integer> jotain = luvut.stream()
                .filter(m -> m > 0)
                .collect(Collectors.toList());
        return jotain;
    }

}
