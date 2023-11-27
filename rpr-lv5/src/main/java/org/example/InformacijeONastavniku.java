package org.example;

import java.util.List;

public class InformacijeONastavniku extends LicneInformacije {
    String titula;
    List<Ocjena> listaOcjena;

    void setTitula(String titula){
        this.titula = titula;
    }

    String getTitula(){
        return this.titula;
    }

    public void ocijeni(Ocjena o){
        listaOcjena.add(o);
    }
}