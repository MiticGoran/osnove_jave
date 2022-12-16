package p16_12_2022;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite jacinu zvuka: ");
        int zvuk = s.nextInt();

        System.out.print("<");
        if (zvuk == 0) {
            System.out.print("");
        }

        for (int i = 1; i <= zvuk; i++) {
                System.out.print("|");

        }
    }
}
