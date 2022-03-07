package pferderennen;

import java.util.Random;

class Pferdenamengenerator {

    private String vorname[] = {"Alter Sack","Uwchen", "Sergej", "Siegfried", "Thomas", "BlueThorn", "Olaf", "Sandra", "LichtGlitzer", "Destruss39"};
    private String nachname[] = {"swoinmann", "Petersen", "Mönstros", "Ludolff", "Kühlschrank" , "144hz Monitor", "Wireless", "Shroud", "SCREAM", "Lappen"};


    public String getName() {
        Random rnd = new Random();
        return vorname[rnd.nextInt(vorname.length)] + "  " + nachname [rnd.nextInt(vorname.length)];
    }
}
