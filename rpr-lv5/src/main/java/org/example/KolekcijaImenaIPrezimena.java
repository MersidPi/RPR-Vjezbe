package org.example;
import java.util.List;

public class KolekcijaImenaIPrezimena {
    List<String> ime;
    List<String> prezime;

    int getIndexNajduzegPara(){
        String pom = " ";
        int indeks = 0;
        for(int i=0; i < ime.size(); i++){
            String naziv = ime.get(i) + prezime.get(i);
            if(naziv.length() > pom.length()){
                pom = naziv;
                indeks = i;
            }
        }
        return indeks;
    }

    String getImeiPrezime(int i) {
        return ime.get(i) + " " + prezime.get(i);
    }
}