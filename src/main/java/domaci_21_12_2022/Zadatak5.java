package domaci_21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

// (Za vezbanje) Napisati program koji ucitava niz a duzine N. Nakon unosa niza a,
// formira se niz b tako sto se prva 3 elementa niza a kopiraju u niz b,
// a ostale elemente niza b ispuniti jedinicama.(niz b je iste duzine kao i niz a)
//
// Unesite N: 6
// Unesite broj: 1
// Unesite broj: 5
// Unesite broj: 2
// Unesite broj: 7
// Unesite broj: 8
// Unesite broj: -1
//
// Niz a: 1, 5, 2, 7, 8, -1
// Niz b: 1, 5, 2, 1, 1, 1
public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        int n;
        int broj;
        System.out.println("Unesite N: ");
        n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj: ");
            broj = s.nextInt();
            a.add(broj);

            if (i > 2){
                b.add(1);
            } else {
                b.add(broj);
            }

            }
        System.out.println("Niz a: " + a);
        System.out.println("Niz b: " + b);
    }

}
