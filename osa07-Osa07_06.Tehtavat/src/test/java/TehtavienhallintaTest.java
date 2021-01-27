
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TehtavienhallintaTest {

    @Test
    public void tehtavalistaAlussaTyhja() {
        Tehtavienhallinta hallinta = new Tehtavienhallinta();
        assertEquals(0, hallinta.tehtavalista().size());
    }

    @Test
    public void tehtavanListaaminenKasvattaaListanKokoaYhdella() {
        Tehtavienhallinta hallinta = new Tehtavienhallinta();
        hallinta.lisaa("Kirjoita testi");
        assertEquals(1, hallinta.tehtavalista().size());
    }

    @Test
    public void lisattyTehtavaLoytyyTehtavalistalta() {
        Tehtavienhallinta hallinta = new Tehtavienhallinta();
        hallinta.lisaa("Kirjoita testi");
        assertTrue(hallinta.tehtavalista().contains("Kirjoita testi"));
    }

    @Test
    public void tehtavanVoiMerkataTehdyksi() {
        Tehtavienhallinta hallinta = new Tehtavienhallinta();
        hallinta.lisaa("Uusi tehtävä");
        hallinta.merkkaaTehdyksi("Uusi tehtävä");
        assertTrue(hallinta.onTehty("Uusi tehtävä"));
    }

    @Test
    public void tehdyksiMerkkaamatonEiOleTehty() {
        Tehtavienhallinta hallinta = new Tehtavienhallinta();
        hallinta.lisaa("Uusi tehtava");
        hallinta.merkkaaTehdyksi("Uusi tehtävä");
        assertFalse(hallinta.onTehty("Joku tehtävä"));
    }
    
    @Test
    public void tehtavaPoistettu() {
        Tehtavienhallinta hallinta = new Tehtavienhallinta();
        hallinta.lisaa("Uusi tehtava");
        hallinta.poistaTehtava("Uusi tehtava");
        assertFalse(hallinta.tehtavalista().contains("Uusi tehtävä"));
    }

}
