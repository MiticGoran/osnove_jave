package domaci_21_12_2022;

//        Zadatak
//        Napisati program koji ucitava N brojeva i smesta ih u niz. Zatim, iz niza,
//        broji koliko je parnih brojeva uneto. brojeve unosi korisnik.
//        Unesite N: 5
//        Unesite broj: 1
//        Unesite broj: 3
//        Unesite broj: 4
//        Unesite broj: 7
//        Unesite broj: 8
//        U nizu ima 2 parna broja.


import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        ArrayList<Integer> parniBrojevi = new ArrayList<Integer>();

        System.out.println("Unesite N: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();
            brojevi.add(broj);
            if (broj % 2 == 0) {
                parniBrojevi.add(broj);
            }
        }
        System.out.println("U nizu ima " + parniBrojevi.size() + " parna broja.");
    }
}

// Moze da se uradi i sa counter-om