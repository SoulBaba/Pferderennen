package pferderennen;

import java.awt.Color;
import javax.swing.JPanel;

class Rennbahn extends JPanel {
    
    Pferd pferde[] = new Pferd[10+1];
    
    
    public Rennbahn() {
       
        this.setLayout(null);
        this.setSize(750, 310);
        this.setBackground(Color.GREEN);
        this.setLocation(15, 10);
       
        for (int i = 0; i < pferde.length; i++) {
            pferde[i] = new Pferd(i, Color.ORANGE);
            this.add(pferde[i]);
        }
        
    }
    public String Leaderboard() {
        Pferd ps[] = this.pferde;
        
        Pferd temp;
	for(int i=1; i<ps.length; i++) {
          
            for(int j=0; j<ps.length-i; j++) {
            
                if(ps[j+1].getX() > ps[j].getX()) {
                    
                    temp = ps[j+1];
                    ps[j+1] = ps[j];
                    ps[j]=temp;
                    
  
                }
            }
        }

        
        return "Rangliste";
        
    }
   
    public boolean bewegPferde() {
        boolean isfinish = true;
        for (int i = 0; i < pferde.length; i++) {
            pferde[i].bewegDich(this.getWidth() - pferde[i].getWidth());
            if (pferde[i].getX() < this.getWidth() - pferde[i].getWidth()) {
                 isfinish = false;
                }
         }
        return isfinish;
    }  
}

