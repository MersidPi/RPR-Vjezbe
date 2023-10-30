package org.example;

import java.util.Objects;

/**
 * Class for user of bank account
 */
public class Korisnik extends Osoba {
    private Racun racun;

    public Korisnik(String ime, String prezime) {
        super(ime, prezime);
        // ovaj kons. moramo imati zbog parent klase
    }

    public void dodajRacun(Racun racun) {
        this.racun = racun;
        // ova metoda je da se doda racun
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Korisnik korisnik = (Korisnik) o;
        return Objects.equals(racun, korisnik.racun);
    }

    public Racun getRacun() {
        return racun;
    }

    public void setRacun(Racun racun) {
        this.racun = racun;
    }
}
