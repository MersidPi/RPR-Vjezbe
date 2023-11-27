package org.example;
import java.util.List;

public class KolekcijaImena {
    List<String> imenaPrezimena;

    String getNajduzeIme(){
        String najduze = "";
        for (String s : imenaPrezimena) {
            if (s.length() > najduze.length()) {
                najduze = s;
            }
        }
        return najduze;
    }
}