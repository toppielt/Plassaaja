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

public class Henkilo {

    private String nimi;
    private String sukupuoli;
    private Henkilo avec;
    private ArrayList<Henkilo> poytaseura = new ArrayList<>();
    private String menu;
    private String juoma;
    private String erityisruokavaliot;

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public void setSukupuoli(String sukupuoli) {
        this.sukupuoli = sukupuoli;
    }

    public void setAvec(Henkilo avec) {
        this.avec = avec;
    }

    public void setMenu(String menu) {
        this.menu = menu;

    }

    public void setJuoma(String juoma) {
        this.juoma = juoma;

    }

    public void setErityisRuokavaliot(String erityisruokavaliot) {
        this.erityisruokavaliot = erityisruokavaliot;
    }

    public void lisaaPoytaseura(Henkilo seura) {
        poytaseura.add(seura);
    }

    public ArrayList<Henkilo> getPoytaseura() {
        return poytaseura;
    }

    public String getNimi() {
        return nimi;
    }

    public String getSukupuoli() {
        return sukupuoli;
    }

    public Henkilo getAvec() {
        return avec;
    }

    public String getMenu() {
        return menu;
    }

    public String getJuoma() {
        return juoma;
    }

    public String getErityisruokavaliot() {
        return erityisruokavaliot;
    }
}
