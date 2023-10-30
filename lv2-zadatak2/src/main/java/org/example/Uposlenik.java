package org.example;

/**
 * Class for worker/employee
 * @author Mersid
 */
public class Uposlenik extends Osoba {
    public Uposlenik(String ime, String prezime) {
        super(ime, prezime);
        //posto osoba nema defaultni konstruktor mi moramo ovaj kons. implementirati
        // sve ostale metode ce se naslijediti
    }
}
