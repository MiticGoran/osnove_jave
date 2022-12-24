package p19_12_2022;
//        (Za vezbanje) Napisati program koji za sve petocifene brojeve radi mirror opciju.
//        Primer izvrsenja:
//        Unesite broj: 32492
//        Novi broj je 29423

import java.util.Scanner;

public class Zadatak10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int broj = s.nextInt();
        String brojX = Integer.toString(broj);

        for (int i = 0; i < brojX.length(); i++) {
            System.out.print(broj % 10);
            broj = broj / 10;
        }
    }
}
