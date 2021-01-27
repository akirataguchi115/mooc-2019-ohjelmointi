
public class Ohjelma {

    public static void main(String[] args) {
        // Testaa metodiasi täällä
    }

    public static String taulukkoMerkkijonona(int[][] taulukko) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < taulukko.length; i++) {
            for (int j = 0; j < taulukko[i].length; j++) {
                sb.append(taulukko[i][j]);
            }
            sb.append("\n");
        }
        return sb.toString();
    }

}
