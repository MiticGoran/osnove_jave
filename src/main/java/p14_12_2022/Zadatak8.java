package p14_12_2022;

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite a: ");
        int a = s.nextInt();

        if (a < 10){
            System.out.println("A je jednocifren broj.");
        } else if (a < 100) {
            System.out.println("A je dvocifren broj.");
        } else {
            System.out.println("A je trocifren broj.");
        }
    }
}
