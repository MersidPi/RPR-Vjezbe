package org.example;

public class Pobjednik {
    String imePrezime;
    int brojZnakova;
    KolekcijaImena kolekcijaImena;

    Pobjednik( KolekcijaImena kolekcija_imena){
        String ime = kolekcija_imena.getNajduzeIme();
        this.imePrezime = ime;
        this.brojZnakova = ime.length();
        this.kolekcijaImena = kolekcija_imena;
    }
}