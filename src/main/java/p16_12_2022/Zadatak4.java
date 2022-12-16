package p16_12_2022;

import java.util.Scanner;

public class Zadatak4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite m: ");
        int m = s.nextInt();
        System.out.println("Unesite n: ");
        int n = s.nextInt();


        for (int i = m; i <= n; i++) {
            System.out.print(i + ", ");
        }

    }
}
