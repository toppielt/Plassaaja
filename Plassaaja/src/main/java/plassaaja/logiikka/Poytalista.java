package plassaaja.logiikka;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author toppielt
 */

/**
 * 
 * Poydat tallennetaan listaan
 * @author toppielt
 */
public class Poytalista {
    
    private int henkiloMaara;
    private ArrayList<Poyta> poydat;
    
    /**
     * 
     * @param henkiloMaara Kuinka monta henkiloa kaiken kaikkiaan on plassavana
     */
    
    public Poytalista(int henkiloMaara) {
        this.henkiloMaara = henkiloMaara;
        poydat = new ArrayList<>();
        
    }
    
    /**
     * luo poydan ja tallentaa sen ArrayListiin
     * 
     * @see plassaaja.logiikka.Poyta
     * @param koko kuinka iso poyta luodaan
     */
    
    public void luoPoyta(int koko) {
        Poyta poyta = new Poyta(koko);
        poydat.add(poyta);
    }
    
    
    
    public void luoPoydat(int montako) {
        
    }
    
    
    
    
}
