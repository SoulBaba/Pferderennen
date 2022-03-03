package pferderennen;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Timer;

public class FensterMain extends JFrame  {
    
    private Rennbahn rennBahn = new Rennbahn();
    private JButton startButton = new JButton();
    private Timer t;
    
    public FensterMain() {

        this.getContentPane();this.setPreferredSize(new Dimension(800, 600));
        this.setLayout(null);
        this.setTitle("Pferderennen");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.pack();
        this.setVisible(true);
        
        this.add(rennBahn);
        
        startButton.setSize(120, 30 );
        startButton.setLocation(15, 330);
        startButton.setText("Start");
        this.add(startButton);
        
         startButton.addActionListener((ActionEvent ae) -> {
             this.StarteRennen();
         });
         
    
    
    
    }
        public void StarteRennen() {
            t = new Timer(50, (ActionEvent ae) -> {
                this.GameLoop();
            });
            t.start();
        
        }

        public void GameLoop() {
            if (rennBahn.bewegPferde()) {
                t.stop();
                
        }
            
        }
                    
    }
