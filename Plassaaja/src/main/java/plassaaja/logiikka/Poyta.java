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

public class Poyta {
    
    ArrayList<Paikka> paikat;
    int paikkoja;
    
    public Poyta(int paikkoja) {
        this.paikat = new ArrayList<>();
        this.paikkoja = paikkoja;
    }
    
    public int paikkojaJaljella() {
        int jaljella = paikkoja - paikat.size();
        
        return jaljella;
    }
    
    
    
}
