package p19_12_2022;

import java.util.Scanner;

//        Napisati program koji od korisnika ucitava N brojeva i na kraju ispisuje srednju vrednost svih brojeva.
//        Unesite N: 5
//        Unesite broj: 1
//        Unesite broj: 2
//        Unesite broj: 9
//        Unesite broj: 6
//        Unesite broj: 8
//        Srednja vrednost je 5.
//        (Objasnjenj) 5 jer je celobrojno deljenje!
public class Zadatak8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N: ");
        int n = s.nextInt();
        int suma = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();
            suma = suma + broj;
        }
        System.out.println("Srednja vrednost je: " + suma / n);
    }
}
