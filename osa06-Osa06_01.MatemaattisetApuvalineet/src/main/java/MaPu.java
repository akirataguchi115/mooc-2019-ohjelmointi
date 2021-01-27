
import java.util.ArrayList;

public class MaPu {

    public static double keskiarvo(ArrayList<Integer> luvut) {
        return luvut.stream().mapToDouble(p -> p.doubleValue())
                .average().getAsDouble();
    }
    // toteuta apumetodit tänne
}
