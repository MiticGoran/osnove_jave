package p19_12_2022;

//        (ZA VEZBANJE)Napisati program koji od korisnika ucitava N jednocifrenih brojeva i
//        od njih formira rezultujuci broj kao na primeru
//        Unesite N: 5
//        Unesite broj: 1
//        Unesite broj: 2
//        Unesite broj: 0
//        Unesite broj: 4
//        Unesite broj: 1
//        Rezultujuci broj je 12041 (Promenljiva tipa int)

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N: ");
        int n = s.nextInt();
        int rezBroj = 0;
        int broj;

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj: ");
            broj = s.nextInt();
            rezBroj = (rezBroj * 10) + broj;

        }
        System.out.println(rezBroj);
    }
}
