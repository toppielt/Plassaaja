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

    Poyta poyta;

    int paikkaNumero;

    public Paikka(Poyta poyta, int paikkaNumero) {
        this.poyta = poyta;
        this.paikkaNumero = paikkaNumero;
    }

    public boolean onkoPariton() {
        if (paikkaNumero % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public Poyta getPoyta() {
        return poyta;
    }
}
