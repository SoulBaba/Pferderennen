package pferderennen;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javafx.scene.paint.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.Timer;

public class FensterMain extends JFrame  {
    
    private Rennbahn rennBahn = new Rennbahn();
    private JButton startButton = new JButton();
    private Timer t;
    
    private Wetten cboWetten = new Wetten();

    private JComboBox cboPferdeliste = new JComboBox();
    
    private JTextArea txaRangliste = new JTextArea();

    
    public FensterMain() {

        this.getContentPane();this.setPreferredSize(new Dimension(800, 600));
        this.setLayout(null);
        this.setTitle("Pferderennen");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.add(rennBahn);
          
        this.add(cboWetten);
        
        this.add(cboPferdeliste);
        
        txaRangliste.setSize(290, 175);
        txaRangliste.setLocation(475, 325);
        txaRangliste.setText("Rangliste");
        txaRangliste.setEditable(false);
        txaRangliste.setVisible(true);
 
        this.add(txaRangliste);
        
        startButton.setSize(120, 30);
        startButton.setLocation(15, 325);
        startButton.setText("Start");
        this.add(startButton);
        
        
         startButton.addActionListener((ActionEvent ae) -> {
             this.StarteRennen();
             });
         
         
         this.pack();
         this.setVisible(true);
    
    }
        public void StarteRennen() {
            rennBahn.nochmal();
            t = new Timer(50, (ActionEvent ae) -> {
                this.GameLoop();
            });
            t.start();
            startButton.setEnabled(false);
                startButton.setText("läuft...");

        
        }
        
        

        public void GameLoop() {
            if (rennBahn.bewegPferde()) {
                t.stop();
                startButton.setEnabled(true);          
                startButton.setText("Start");
        }
            txaRangliste.setText(rennBahn.Leaderboard());
        }
                    
    }
