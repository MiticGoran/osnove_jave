package p26_12_2022;
//        Napisati metodu koja stampa N zvezdica u istom redu. Broj zvezdica je odredjen parametrom N.
//        Ako se metoda pozove za N=5, metoda stampa 5 zvezdica i enter
//        N=5, print je=> * * * * *
//
//        Ako se metoda pozove za N = 9, metoda stampa 9 zvezdica i enter
//        N=9, print je=> * * * * * * * * *
//        (Za vezbanje)
//        Napisati main program koji koristi metodu definisanu u 6.zad tako da stampa sledecu sliku za M.
//        M unosi korisnik.
//        Primer izvrsenja:
//        Unesite M: 6
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * * * *


import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.println("Unesite N: ");
//        int n = s.nextInt();
//        zvezdice(n);
        System.out.println("Unesite M: ");
        int m = s.nextInt();
        for (int i = 1; i <= m; i++) {
            zvezdice(i);
            System.out.println();
        }

    }

    public static void zvezdice(int n){
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }

    }
}
