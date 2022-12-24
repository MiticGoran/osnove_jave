package domaci_21_12_2022;
//        Za vezbanje) Napisati program koji ucitava niz stringova duzine N,
//        tako da ucitavanje elemenata u niz a bude obrnuto.
//        Primer:
//        Unesite N: 4
//        Unesite string: xxx1
//        Unesite string: xxx4
//        Unesite string: xxx6
//        Unesite string: xxx9
//
//        Niz a: xxx9, xxx6, xxx4, xxx1
//        Komentar: Stanje niza a u memoriji je:
//        a[0]="xxx9",
//        a[1]="xxx6",
//        a[2]="xxx4",
//        a[3]="xxx1",

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<String>();
        int n;
        String odgovor;
        System.out.println("Unesite N: ");
        n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite string: ");
            odgovor = s.next();
            a.add(odgovor);
            }
        System.out.print("Niz A: ");
        for (int i = a.size(); i > 0; i--) {
            System.out.print(a.get(i - 1)+ ", ");
        }

//        System.out.println("Stanje niza A u memoriji je: " + a);
        }

}

