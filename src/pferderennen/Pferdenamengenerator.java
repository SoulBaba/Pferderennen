package pferderennen;

import java.util.Random;

class Pferdenamengenerator {

    private String vorname[] = {"Alter Sack","Uwe", "Sergej", "Siegfried", "Thomas", "Peter von Oldenburg", "Olaf", "Sandra", "LichtGlitzer", "Destruss39"};
    private String nachname[] = {"1", "ölli", "Mönstros", "Ludolff", "Kühlschrank" , "VG278 Monitor Asus", "Logitech G pro", "Shroud", "SCREAM", "Lappen"};


    public String getName() {
        Random rnd = new Random();
        return vorname[rnd.nextInt(vorname.length)] + " " + nachname [rnd.nextInt(nachname.length)];
    }
}
