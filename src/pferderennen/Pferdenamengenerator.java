package pferderennen;

import java.util.Random;

class Pferdenamengenerator {

    private String vorname[] = {"Alter Sack","Uwe", "Sergej", "Siegfried", "Thomas", "BlueThorn", "Olaf", "Sandra", "LichtGlitzer", "Destruss39"};
    private String nachname[] = {"1", "ölli", "Mönstros", "Ludolff", "Kühlschrank" , "144hz", "Wireless", "Shroud", "SCREAM", "Lappen"};


    public String getName() {
        Random rnd = new Random();
        return vorname[rnd.nextInt(vorname.length)] + "  " + nachname [rnd.nextInt(vorname.length)];
    }
}
