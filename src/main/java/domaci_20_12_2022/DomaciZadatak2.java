package domaci_20_12_2022;

import java.util.Scanner;

//        Napisati program koji ucitava RIMSKE brojeva od korisnika i na ekranu
//        ispisuje arapsku vrednost sve dok korisnik ne unese KRAJ..

public class DomaciZadatak2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String rimskiBroj = "";
        String arapskiBroj = "";

        while(!(rimskiBroj.equals("KRAJ"))){
            System.out.println("Unesite rimski broj: ");
            rimskiBroj = s.next();
            if (rimskiBroj.equals("X")){
                arapskiBroj = "10";
                System.out.println("Arapski: " + arapskiBroj);
            } else if (rimskiBroj.equals("C")){
                arapskiBroj = "50";
                System.out.println("Arapski: " + arapskiBroj);
            } else if (rimskiBroj.equals("D")){
                arapskiBroj = "500";
                System.out.println("Arapski: " + arapskiBroj);
            } else if (rimskiBroj.equals("M")){
                arapskiBroj = "1000";
                System.out.println("Arapski: " + arapskiBroj);
            } else if (rimskiBroj.equals("I")){
                arapskiBroj = "1";
                System.out.println("Arapski: " + arapskiBroj);
            }

        }
        System.out.println("Kraj programa.");
    }
}
