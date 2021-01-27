package testausta;

import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class OhjelmaTest {

    @Test
    public void minusOneHalts() {
        assertEquals("Pulloja: 6\n"
                + "Oppilaita: 3\n"
                + "Keskiarvo: 2.0", Ohjelma.suorita(new Scanner("3\n2\n1\n-1\n")));
    }

    @Test
    public void negativeIgnore() {
        assertEquals("Pulloja: 1\n"
                + "Oppilaita: 2\n"
                + "Keskiarvo: 0.5", Ohjelma.suorita(new Scanner("1\n0\n-55\n-1\n")));
    }

    @Test
    public void noBottles() {
        assertEquals("Pulloja: 0\n"
                + "Oppilaita: 0\n"
                + "Keskiarvoa ei voida laskea", Ohjelma.suorita(new Scanner("-55\n-1\n")));
    }
    // toteuta tänne testit luokkaa Ohjelma-varten
}
