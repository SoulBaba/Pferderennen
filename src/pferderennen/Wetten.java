
package pferderennen;


import javafx.scene.paint.Color;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Wetten extends JPanel{
    
    private String[] wettBeträge = {"5","10","20","50","100"};
    private JComboBox cboWetten = new JComboBox(wettBeträge);
    
    private String[] pferdeliste = {" 1 "," 2 "," 3 "," 4 "," 5 "," 6 "," 7 "," 8 "," 9 "," 10 "};
    private JComboBox cboPferdeliste = new JComboBox(pferdeliste);
    
    private JLabel txaPferdenummer = new JLabel();
    private JLabel txaWetteinsatz = new JLabel();

    private JLabel sokontostand = new JLabel();
    private JLabel kontostand = new JLabel();
    
    public Wetten() { 
    
    this.setLayout(null);
    this.setSize(300,300);
    this.setLocation(150, 325);
   
    txaWetteinsatz.setSize(100,60);
    txaWetteinsatz.setLocation(1,0);
    txaWetteinsatz.setText("Wetteinsatz:");
    this.add(txaWetteinsatz);
    
    cboWetten.setSize(60,20);
    cboWetten.setLocation(80,20);
    this.add(cboWetten);
    
    txaPferdenummer.setText("Pferdenummer:");
    txaPferdenummer.setSize(100,60);
    txaPferdenummer.setLocation(150,0);
    this.add(txaPferdenummer);
   
    cboPferdeliste.setSize(60,20);
    cboPferdeliste.setLocation(250,20);
    this.add(cboPferdeliste);
    
    sokontostand.setText("Kontostand:");
    sokontostand.setLocation(50,350);
    this.add(sokontostand);
    
    kontostand.setText("5000");
    kontostand.setLocation(50,350);
    this.add(kontostand);
   
    
    
    
    }

}