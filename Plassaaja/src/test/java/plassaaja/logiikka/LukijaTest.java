/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plassaaja.logiikka;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
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
public class LukijaTest {

    Lukija lukija = new Lukija();

    File tiedosto;

    HashMap<String, Henkilo> ilmot;

    public LukijaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws IOException {

        tiedosto = new File("plassaajaTestidata.csv");
        ilmot = new HashMap<>();
        lukija.lueIlmoittautumiset(tiedosto);
        ilmot = lukija.getIlmoittautumiset();
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test

    public void lukijaLukeeKaikki() throws IOException {

        assertEquals(23, ilmot.size());

    }

    @Test

    public void lukijaLukeeNimen() {

        boolean totuus = ilmot.containsKey("Terhi Palviainen");

        assertEquals(true, totuus);

    }

    @Test

    public void asettaaSukupuolenOikein() {

        Henkilo terhi = ilmot.get("Terhi Palviainen");

        assertEquals("N", terhi.getSukupuoli());
    }
    
    @Test
    
    public void asettaaAvecinOikein() {
        
        Henkilo terhi = ilmot.get("Terhi Palviainen");
        
        assertEquals("Verneri Närhi", terhi.getAvec());
    }
    
    @Test
    
    public void asettaaMenunOikein() {
        
        Henkilo terhi = ilmot.get("Terhi Palviainen");
        
        assertEquals("Liha", terhi.getMenu());
    }
    
    @Test
    
    public void asettaaJuomanOikein() {
        
        Henkilo terhi = ilmot.get("Terhi Palviainen");
        
        assertEquals("Valkoviini", terhi.getJuoma());
    }
    
    @Test 
    
    public void asettaaErityisruokavaliotOikein() {
        
        Henkilo terhi = ilmot.get("Terhi Palviainen");
        
        assertEquals("ei", terhi.getErityisruokavaliot());
    }
}
