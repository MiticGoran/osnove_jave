package p21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {
        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N: ");
        int n = s.nextInt();
        int broj = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj: ");
            broj = s.nextInt();
            brojevi.add(broj);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(brojevi.get(i) + ", ");
        }

    }
}
