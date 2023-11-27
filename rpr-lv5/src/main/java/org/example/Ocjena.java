package org.example;

import java.util.List;

public class Ocjena {
    LicneInformacije osoba;
    int ocjena;

    public void setOcjena(int ocjena) {
        if (this.ocjena > 0 && ocjena < 10){
            this.ocjena = ocjena;
        }
        else {
            throw new IllegalArgumentException();
        }

    }
    Ocjena(LicneInformacije osoba, int ocjena){
        this.osoba=osoba;
        setOcjena(ocjena);
    }
}