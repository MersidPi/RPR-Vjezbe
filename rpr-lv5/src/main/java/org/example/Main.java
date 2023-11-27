package org.example;

public class Main {
    public static void main(String[] args) {
        InformacijeOStudentu studentInfo = new InformacijeOStudentu();
        studentInfo.setIme("Mersid");
        studentInfo.setPrezime("Pilipovic");
        studentInfo.setBrojIndexa(19070);
        studentInfo.setGodinaStudija(2);
        System.out.println(studentInfo.getIme() + " " + studentInfo.getPrezime() + ", " + studentInfo.getBrojIndexa() + ", " + studentInfo.getGodinaStudija() + ".");
        InformacijeONastavniku nastavnik = new InformacijeONastavniku();
        nastavnik.setIme("Zeljko");
        nastavnik.setPrezime("Juric <3");
        nastavnik.setTitula("Redovni profesor najjaci na faxu cijelom");
        System.out.println(nastavnik.getIme() + " " + nastavnik.getPrezime() + " " + nastavnik.getTitula() + ".");



    }
}