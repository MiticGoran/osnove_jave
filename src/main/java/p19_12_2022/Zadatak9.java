package p19_12_2022;

import java.util.Scanner;

//        (Za vezbanje) Napisati program koji za sve petocifrene brojeve izvlaci sve cifre i stampa ih na ekranu.
//        Primer izvrsenja:
//        Unesite broj: 19452
//        2, 5, 4, 9, 1
public class Zadatak9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int broj = s.nextInt();
        String brojS = Integer.toString(broj);

        for (int i = 0; i < brojS.length() ; i++) {
           System.out.print(broj % 10 + ", ");
           broj = broj /10;
        }
    }
}
