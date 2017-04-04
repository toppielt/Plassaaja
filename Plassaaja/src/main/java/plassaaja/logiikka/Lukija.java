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
import java.util.Scanner;

public class Lukija {

    File ilmoittautumiset;
    Scanner scanner;
    ArrayList<Henkilo> henkilot;
    CSVReader tiedostonLukija;

    public Lukija() {
        this.henkilot = new ArrayList<>();
    }

    public void lueIlmoittautumiset(File tiedosto) throws FileNotFoundException, IOException {

        this.tiedostonLukija = new CSVReader(new FileReader(tiedosto));
        String[] nextLine;
        while ((nextLine = tiedostonLukija.readNext()) != null) {
            Henkilo henkilo = new Henkilo(nextLine[0]);
            henkilo.setSukupuoli(nextLine[1]);
            henkilo.setAvec(nextLine[2]);
            henkilo.setMenu(nextLine[3]);
            henkilo.setJuoma(nextLine[4]);
            henkilo.setJuoma(nextLine[5]);
            
            henkilot.add(henkilo);
        }

    }

}
