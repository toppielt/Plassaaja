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

import java.util.ArrayList;
import java.util.HashMap;

public class Poyta {
    
    HashMap<Paikka, Henkilo> paikat;
    int paikkoja;
    
    /**
     * 
     * @param paikkoja syötteenä montako paikkaa pöydässä on 
     */
    
    public Poyta(int paikkoja) {
        this.paikat = new HashMap<>();
        this.paikkoja = paikkoja;
    }
    
    /**
     * 
     * @return palauttaa montako paikkaa jäljellä 
     */
    
    public int paikkojaJaljella() {
        int jaljella = paikkoja - paikat.size();
        
        return jaljella;
    }
    
    /**
     * 
     * @param paikka Henkilolla on oltava tietty paikka
     * @param henkilo 
     */
    
    public void lisaaPaikka(Paikka paikka, Henkilo henkilo) {
        paikat.put(paikka, henkilo);
        
    }
    
    public boolean onkoVapaa(Paikka paikka) {
        
        
        return true;
    }
    
    
    
}
