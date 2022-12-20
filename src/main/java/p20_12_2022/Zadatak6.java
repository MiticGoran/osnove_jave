package p20_12_2022;

//          Napisati program koji sabira brojeve koje korisnik unosi, pritom da suma ne predje 100.
//        Na kraju programa ispisati sracunatu sumu.
//        Unesite vrednost: 20
//        Unesite vrednost: 50
//        Unesite vrednost: 50
//        Prekoracenje! Kraj programa. Sracunata suma je 70.

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        int zbir = 0;
        int broj = 0;
        int prekoracenje = 0;

        while (zbir < 100) {
            System.out.println("Unesite vrednost: ");
            broj = s.nextInt();
            zbir = zbir + broj;
            if (zbir > 100) {
                prekoracenje = zbir - broj;
            }
        }
        System.out.println("Prekoracenje! Kraj programa. Sracunata suma je " + prekoracenje);
    }
}
