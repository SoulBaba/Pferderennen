
package pferderennen;

import java.awt.Color;
import java.util.Random;
import javax.swing.JLabel;

class Pferd extends JLabel {
    
    private int nummer;
    private Color farbe;
    private int zahlchen;
    private int ziellinie;
    private String name;
    private int sprung;
    private Random rnd = new Random();
    
    public Pferd(int nummer, Color farbe) {
        this.nummer = nummer;
        this.farbe = farbe;
        this.setSize(20, 20);
        this.setText("" + nummer);
        
        this.sprung = zahlchen = rnd.nextInt(5)-2;
        zahlchen = rnd.nextInt(9)+4;
        
        Pferdenamengenerator pf = new Pferdenamengenerator();
        this.name = pf.getName();
        
        this.setLocation(10, 30 * nummer + 10);
        this.setOpaque(true);
        this.setBackground(farbe);
  
    }               

    public void bewegDich(int ziellinie) {
        int zahlchen = rnd.nextInt(5+sprung) + 2;
        if (this.getX() > ziellinie) {
            zahlchen = 10;
        }
        this.setLocation(this.getX() + zahlchen, 30 * nummer + 10);
    }

    public String getName() {
        return name;
    }
  
    
}
