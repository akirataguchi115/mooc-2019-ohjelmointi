
public class Raha {

    private final int euroa;
    private final int senttia;

    public Raha(int euroa, int senttia) {

        if (senttia > 99) {
            euroa = euroa + senttia / 100;
            senttia = senttia % 100;
        }

        this.euroa = euroa;
        this.senttia = senttia;
    }

    public int eurot() {
        return this.euroa;
    }

    public int sentit() {
        return this.senttia;
    }

    public String toString() {
        String nolla = "";
        if (this.senttia < 10) {
            nolla = "0";
        }

        return this.euroa + "." + nolla + this.senttia + "e";
    }

    public Raha plus(Raha lisattava) {
        return new Raha(lisattava.euroa + this.euroa, lisattava.senttia
                + this.senttia);
    }

    public boolean vahemman(Raha verrattava) {
        if (verrattava.euroa < 0) {
            return false;
        } else if (verrattava.senttia < 0) {
            return false;
        }

        if ((this.euroa * 100 + this.senttia) < (verrattava.euroa * 100
                + verrattava.senttia)) {
            return true;
        }
        return false;
    }

    public Raha miinus(Raha vahentaja) {
        int uusieuro = this.euroa;
        int uusisentti = this.senttia;
        uusieuro -= vahentaja.euroa;
        uusisentti -= vahentaja.senttia;
        if (uusisentti < 0) {
            uusieuro--;
            uusisentti += 100;
        }
        if (uusieuro < 0) {
            uusieuro = 0;
            uusisentti = 0;
        }
        return new Raha(uusieuro, uusisentti);
    }

}
