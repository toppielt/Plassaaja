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
import com.opencsv.CSVReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * Lukee syötettävästä tiedostosta (.csv) osallistujien tiedot ja luo kustakin
 * osallistujasta Henkilo-olion
 *
 * @author toppielt
 */
public class Lukija {

    File ilmoittautumiset;
    Scanner scanner;
    HashMap<String, Henkilo> henkilot;
    CSVReader tiedostonLukija;

    public Lukija() {
        this.henkilot = new HashMap<>();
    }
    
    /**
     * Luetaan tiedosto riveittäin, rivillä olevat tiedokohteet erotettu pilkulla. 
     * @param tiedosto
     * @throws FileNotFoundException
     * @throws IOException 
     */
    
    public void lueIlmoittautumiset(File tiedosto) throws FileNotFoundException, IOException {
        try {
            this.tiedostonLukija = new CSVReader(new FileReader(tiedosto));
            String[] nextLine;
            while ((nextLine = tiedostonLukija.readNext()) != null) {
                Henkilo henkilo = new Henkilo(nextLine[0]);
                henkilo.setSukupuoli(nextLine[1]);
                henkilo.setAvec(nextLine[2]);
                henkilo.setMenu(nextLine[3]);
                henkilo.setJuoma(nextLine[4]);
                henkilo.setErityisruokavaliot(nextLine[5]);

                henkilot.put(henkilo.getNimi(), henkilo);
            }
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());

        }

    }
    
    /**
     * 
     * @return palauttaa ilmoittautumiset sisältävät HashMapin, avaimena nimi ja arvona henkilo-olio 
     */

    public HashMap getIlmoittautumiset() {

        if (henkilot.isEmpty()) {
            return null;
        }
        return henkilot;
    }

}
