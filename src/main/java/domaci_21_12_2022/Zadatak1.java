package domaci_21_12_2022;

//        Zadatak
//        Napisati program koji u sebi ima definisan niz od 10 broja (brojevi su proizvoljni) i koji menja
//        vrednost elementa na pozciji K. K i novu vrednost unosi korisnik.
//        Primer:
//        Unesite pozicjiu od 0 do 9: 3
//        Unesite novu vrednost: 11
//        Element na 3. poziciji treba na kraju da ima vrednost 11 u vasem programu.


import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> brojevi = new ArrayList<Integer>();

        brojevi.add(2);
        brojevi.add(12);
        brojevi.add(16);
        brojevi.add(88);
        brojevi.add(44);
        brojevi.add(33);
        brojevi.add(28);
        brojevi.add(23);
        brojevi.add(11);
        brojevi.add(3);


        System.out.println("Unesite poziciju od 0 do 9: ");
        int k = s.nextInt();

        System.out.println("Unesite novu vrednost: ");
        int novaVrednost = s.nextInt();
        brojevi.set(k, novaVrednost);

        System.out.println("Nova vrednost za element na poziciji 3 je: " + brojevi.set(k, novaVrednost));

    }
}
