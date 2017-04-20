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

    /**
     * Kaikista plassattavat ovat henkilo-olioita
     * @author toppielt
     */
    
public class Henkilo {
    
    

    private String nimi;
    private String sukupuoli;
    private String avec;
    private ArrayList<Henkilo> poytaseura = new ArrayList<>();
    private String menu;
    private String juoma;
    private String erityisruokavaliot;
    
    /**
     * Kontstruktori asettaa nimen
     * @param nimi 
     */
    
    public Henkilo(String nimi) {
        this.nimi = nimi;
    }
    
    /**
     * Nimen voi tarvittaessa korjata
     * @param nimi 
     */
    
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
    
    /**
     * Logiikan kannalta tulee olla sukupuoli
     * @param sukupuoli 
     */
    public void setSukupuoli(String sukupuoli) {
        this.sukupuoli = sukupuoli;
    }
    
    /**
     * Avec plassataan henkiloa vastapaata
     * 
     * @param avec Henkilo
     */

    public void setAvec(String avec) {
        this.avec = avec;
    }
    
    /**
     * Menu kertoo ruokavalion
     * @param menu 
     */

    public void setMenu(String menu) {
        this.menu = menu;

    }
    
    /**
     *Juomasta selviää henkilon juoma
     * @param juoma 
     */
    
    public void setJuoma(String juoma) {
        this.juoma = juoma;

    }
    
    /**
     * Mahdolliset erityisruokavaliot on hyvä huomioida
     * @param erityisruokavaliot 
     */
    
    public void setErityisruokavaliot(String erityisruokavaliot) {
        this.erityisruokavaliot = erityisruokavaliot;
    }
    
    /**
     * 
     * Pöytäseurasta on apua järjestyksen luomisessa
     * @param seura 
     */
    
    public void lisaaPoytaseura(Henkilo seura) {
        poytaseura.add(seura);
    }
    
    /**
     * palauttaa pöytäseuran ArrayListina
     * @return henkiloita, jotka kys. henkilo haluaa lähelleen istuvan
     */

    public ArrayList<Henkilo> getPoytaseura() {
        return poytaseura;
    }
    
    /**
     * 
     * @return henkilon palauttaa nimen 
     */

    public String getNimi() {
        return nimi;
    }
    
    /**
     * 
     * @return palauttaa henkilon sukupuolen 
     */

    public String getSukupuoli() {
        return sukupuoli;
    }
    
    /**
     * 
     * @return palauttaa henkilon avecin
     */
    
    public String getAvec() {
        return avec;
    }
    
    /**
     * 
     * @return palauttaa henkilon menun
     */
    
    public String getMenu() {
        return menu;
    }
    
    /**
     * 
     * @return palauttaa henkilon juoman 
     */

    public String getJuoma() {
        return juoma;
    }
    
    /**
     * 
     * @return palauttaa henkilon mahdolliset erityisruokavaliot
     * 
     */
    
    public String getErityisruokavaliot() {
        return erityisruokavaliot;
    }
}
