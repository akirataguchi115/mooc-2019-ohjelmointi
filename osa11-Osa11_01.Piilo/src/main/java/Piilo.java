
public class Piilo<T> {

    private T t;

    public Piilo() {
    }

    public void laitaPiiloon(T piilotettava) {
        this.t = piilotettava;
    }

    public T otaPiilosta() {
        T u = this.t;
        this.t = null;
        return u;
    }

    public boolean onkoPiilossa() {
        if (this.t == null) {
            return false;
        }
        return true;
    }
}
