package p16_12_2022;

import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite a: ");
        int a = s.nextInt();

        System.out.println("Unesite b: ");
        int b = s.nextInt();

        for (int i = 1; i < 21 ; i++) {
            if (i >= a && i <= b){
                System.out.print("_");
            } else {
                System.out.print("*");
            }
        }

    }
}
