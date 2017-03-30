package logiikka;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import logiikka.Henkilo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author toppielt
 */
public class HenkiloTest {

    Henkilo henkilo;

    public HenkiloTest() {
    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

        henkilo = new Henkilo("Matti");
    }

    @After
    public void tearDown() {
    }

    @Test

    public void konstruktoriAsettaaNimen() {

        String vastaus = henkilo.getNimi();

        assertEquals("Matti", vastaus);
    }

    @Test

    public void sukupuoliAsettuuOikein() {

        henkilo.setSukupuoli("m");

        String vastaus = henkilo.getSukupuoli();

        assertEquals("m", vastaus);
    }

    @Test

    public void avecMeneeOikein() {
        henkilo.setAvec("Maija");

        String vastaus = henkilo.getAvec();

        assertEquals("Maija", vastaus);
    }

    @Test

    public void menuMeneeOikein() {

        henkilo.setMenu("Liha");

        String vastaus = henkilo.getMenu();

        assertEquals("Liha", vastaus);
    }

    @Test

    public void juomaMeneeOikein() {
        henkilo.setJuoma("valkoviini");

        String vastaus = henkilo.getJuoma();

        assertEquals("valkoviini", vastaus);

    }

    @Test

    public void erityisruokavaliotOikein() {

        henkilo.setErityisruokavaliot("Kalaton, sienetön");

        String vastaus = henkilo.getErityisruokavaliot();

        assertEquals("Kalaton, sienetön", vastaus);
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
