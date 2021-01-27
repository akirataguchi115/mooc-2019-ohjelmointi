
public class StringUtils {

    public static boolean sisaltaa(String sana, String haettava) {
        if (sana == null || haettava == null) {
            return false;
        }
        if (sana.toUpperCase().trim().contains(haettava.toUpperCase().trim())) {
            return true;
        }
        return false;
    }

}
