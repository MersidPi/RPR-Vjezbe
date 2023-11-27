package org.example;

import java.util.ArrayList;
import java.util.List;

interface Predstavljanje {
    String predstavi();
}

public class KolekcijaPoruka {
    List<String> poruke;

    List<String> getPoruke(){
        return this.poruke;
    }

    KolekcijaPoruka (List<Predstavljanje>lista){
        this.poruke = new ArrayList<>();
        for (Predstavljanje predstavljanje : lista)
            poruke.add(predstavljanje.predstavi());
    }
}