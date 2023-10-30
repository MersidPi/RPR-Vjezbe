package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] ARGS) {
        String[] args = new String[2];
        System.out.println("Upisite sinus ili faktorijel: ");
        Scanner s = new Scanner(System.in);
        args[0] = s.nextLine();
        System.out.println("Upisite broj: ");
        args[1] = s.nextLine();
        if(args[0].equals("sinus"))
            System.out.println("rezultat je: " + Matematika.sinus(Double.parseDouble(args[1])));
        else if (args[0].equals("faktorijel"))
            System.out.println("rezultat je: " + Matematika.faktorijel(Integer.parseInt(args[1])));
        else
            System.out.println("GRESKA");


        //System.out.println("idemo testirat " + Matematika.sinus(30));
    }
}