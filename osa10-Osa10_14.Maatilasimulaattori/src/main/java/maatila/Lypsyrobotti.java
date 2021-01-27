package maatila;

public class Lypsyrobotti {

    private Maitosailio maitosailio;

    public Lypsyrobotti() {
    }

    public void setMaitosailio(Maitosailio maitosailio) {
        this.maitosailio = maitosailio;
    }

    public Maitosailio getMaitosailio() {
        return maitosailio;
    }

    public void lypsa(Lypsava lypsava) {
        if (getMaitosailio() == null) {
            System.out.println("Maidot menevät hukkaan!");
            return;
        }
        this.maitosailio.lisaaSailioon(lypsava.lypsa());
    }
}
