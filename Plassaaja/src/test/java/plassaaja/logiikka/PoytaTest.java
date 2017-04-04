package plassaaja.logiikka;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import plassaaja.logiikka.Poyta;
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
public class PoytaTest {
    
    Poyta poyta;
    
    public PoytaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        poyta = new Poyta(24);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    
    public void alussaJaljellaKaikkiPaikat() {
        
        assertEquals(24, poyta.paikkojaJaljella());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
