package plassaaja.logiikka;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author toppielt
 */
public class Paikka {

    private Poyta poyta;

    private int paikkanumero;

    public Paikka(Poyta poyta, int paikkanumero) {
        this.poyta = poyta;
        this.paikkanumero = paikkanumero;
    }
    
    /**
     * parilliset alhaalla, parittomat alhaalla
     * @return palautta true jos paikkanumero pariton
     */
    
    public boolean onkoPariton() {
        if (paikkanumero % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }
    
    /**
     * 
     * @return palauttaa mihin pöytään paikka kuuluu 
     */

    public Poyta getPoyta() {
        return poyta;
    }
    
    /**
     * 
     * @return palauttaa paikkanumeron 
     */
    
    public int getPaikkanumero() {
        return paikkanumero;
    }
}
