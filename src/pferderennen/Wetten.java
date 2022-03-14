
package pferderennen;


import javax.swing.JComboBox;
import javax.swing.JLabel;

public class Wetten extends JLabel{
    
  
    private String[] wettBeträge = {"5","10","20","50","100"};
    private JComboBox cboWetten = new JComboBox(wettBeträge);
    
    
    
    public Wetten() {
    
        
  
    cboWetten.setSize(60,90);
    cboWetten.setLocation(145, 325);
    this.add(cboWetten);
    
    }
}
