/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plassaaja.kayttoliittyma;

/**
 *
 * @author toppielt
 */
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 * Graafien käyttöliittymä
 * @author toppielt
 */

public class Kayttoliittyma implements Runnable {

    private JFrame frame;

    public Kayttoliittyma() {
    }
/**
 * Suoritusikkunan luonti
 */
    @Override
    public void run() {
        frame = new JFrame("Plassaaja");
        frame.setPreferredSize(new Dimension(500, 600));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void luoKomponentit(Container container) {
        container.setLayout(new BorderLayout());

        container.add(new JButton("OHJE"), BorderLayout.NORTH);
        
        container.add(luoValikko(), BorderLayout.SOUTH);

    }

    public JFrame getFrame() {
        return frame;
    }
            
    private JPanel luoValikko() {
        JPanel panel = new JPanel(new GridLayout(1,3));
        panel.add(new JButton("Luo uusi istumajärjestys"));
        panel.add(new JButton("Hae istumajärjestys"));
        return panel;
    }
    
    private JPanel luoLisaaja() {
        return null;
    }
}
