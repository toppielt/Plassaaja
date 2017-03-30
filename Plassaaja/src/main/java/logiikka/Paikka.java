package logiikka;

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

    public boolean onkoPariton() {
        if (paikkanumero % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public Poyta getPoyta() {
        return poyta;
    }

    public int getPaikkanumero() {
        return paikkanumero;
    }
}
