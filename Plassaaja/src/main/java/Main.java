/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author toppielt
 */
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import javax.swing.SwingUtilities;
import plassaaja.kayttoliittyma.Kayttoliittyma;
import plassaaja.logiikka.Henkilo;
import plassaaja.logiikka.Lukija;

public class Main {

    public static void main(String[] args) throws IOException {
        // Kayttoliittyma kayttoliittyma = new Kayttoliittyma();
        // SwingUtilities.invokeLater(kayttoliittyma);

        Kayttoliittyma kayttis = new Kayttoliittyma();
        kayttis.run();
        Lukija lukija = new Lukija();

        File tiedosto = new File("plassaajaTestidata.csv");

        lukija.lueIlmoittautumiset(tiedosto);

        HashMap<String, Henkilo> ilmot = new HashMap<>();

        ilmot = lukija.getIlmoittautumiset();

        System.out.println(ilmot.size());

        Henkilo aleksi = ilmot.get("Arto Aniluoto");

        System.out.println(aleksi.getErityisruokavaliot());
        System.out.println(ilmot.keySet());

    }
}
