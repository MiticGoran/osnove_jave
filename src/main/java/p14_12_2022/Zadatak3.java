package p14_12_2022;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj a: ");
        double a = s.nextDouble();

        System.out.println("Unesite broj b: ");
        double b = s.nextDouble();

        System.out.println("Unesite broj c: ");
        double c = s.nextDouble();

        System.out.println("Srednja vrednost je: " + (a + b + c)/3);

    }
}
