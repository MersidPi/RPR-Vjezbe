package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "idemoo zadatak 3 s tuta 2" );
        System.out.println("Unesite brojeve, unesite 'stop' za kraj unosa");
        Scanner scanner = new Scanner(System.in);
        List<Double> numbers = new ArrayList<Double>();

        while(true) {
            String line = scanner.nextLine();
            if ("stop".equalsIgnoreCase(line.trim())) {
                break;
                // ignore case znaci moze i sToP i tako
                // line.trim znaci ako unese 'stop   ' i to ce se prihvatiti
            }
            try {
                Double number = Double.parseDouble(line);
                numbers.add(number);
            }
            catch (Exception e) {
                System.out.println("Niste unijeli broj! Ponovite unos: ");
                // moze continue; al svakako ce ici continueat :D
            }
        }

        System.out.println("Informacije o unesenim brojevima: ");
        System.out.println("Minimalna vrijednost: " + MathUtils.min(numbers));
        System.out.println("Maksimalna vrijednost: " + MathUtils.max(numbers));
        System.out.println("Srednja vrijednost: " + MathUtils.mean(numbers));
        System.out.println("Standardna devijacija: " + MathUtils.stddev(numbers));
    }
}
