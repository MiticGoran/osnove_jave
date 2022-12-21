package p21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

//        Zadatak
//        Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i koji
//        prikazuje element na poziciji K. K unosi korisnik i smatrajte da unosi u opsegu od 0 do 4.
//        Primer:
//        Unesite pozicjiu: 2
//        Na pozicji 2 je vrednost 7.
public class Zadatak4 {
    public static void main(String[] args) {
        ArrayList<Integer> brojevi = new ArrayList<>();
        brojevi.add(15);
        brojevi.add(11);
        brojevi.add(35);
        brojevi.add(43);
        brojevi.add(29);
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite poziciju od 0 do 4: ");
        int k = s.nextInt();
        System.out.println("Na poziciji " + k + " je vrednost " + brojevi.get(k));

    }
}
