package p19_12_2022;

import java.util.Scanner;

//        Napisati program koji sakriva uneti password..
//        Primer izvrsenja:
//        Unestite password: OvoJePassword123
//        Skriverni password: ****************
public class Zadatak11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite password: ");
        String password = s.next();

        System.out.print("Skriveni password: ");
        for (int i = 0; i < password.length(); i++) {
            System.out.print("*");
        }
    }
}
