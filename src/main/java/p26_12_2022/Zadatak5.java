package p26_12_2022;

import java.util.Scanner;

//    Napisati metodu stampajApsolutnuVrednost, koja stampa apsolutnu vrednost   prosledjene vrednosti.
public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite a: ");
        int a = s.nextInt();
        stampajApsolutnuVrednost(a);
    }

    public static void stampajApsolutnuVrednost(int a){
        System.out.println(Math.abs(a));
    }


}
