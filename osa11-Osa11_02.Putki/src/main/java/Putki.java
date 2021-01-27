
import java.util.ArrayList;
import java.util.List;

public class Putki<T> {

    private List<T> putki;

    public Putki() {
        this.putki = new ArrayList<>();
    }

    public void lisaaPutkeen(T arvo) {
        this.putki.add(arvo);
    }

    public T otaPutkesta() {
        if (this.putki.isEmpty()) {
            return null;
        }
        T arvo = this.putki.get(0);
        this.putki.remove(0);
        return arvo;
    }

    public boolean onkoPutkessa() {
        return !this.putki.isEmpty();
    }
}
