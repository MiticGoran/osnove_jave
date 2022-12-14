package p14_12_2022;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite znak karte koja je na stolu: ");
        String a = s.next();

        System.out.println("Unesite broj karte koja je na stolu: ");
        String b = s.next();

        System.out.println("Unesite znak karte koju igrac zeli da odigra: ");
        String c = s.next();

        System.out.println("Unesite broj karte koju igrac zeli da odigra: ");
        String d = s.next();

        if (a.equals(c) || b.equals(d)){
            System.out.println("Potez je validan");
        } else {
            System.out.println("Potez nije validan");
        }

    }
}
