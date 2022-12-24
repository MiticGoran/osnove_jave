package domaci_21_12_2022;

//        Zadatak
//        Napisati program koji ucitava niz A duzine N, i koji nakon unosa niz A stampa
//        sve elemente niza koji su veci od nule.
//        Primer izvrsenja:
//        Unesite N: 5
//        Unesite broj: 1
//        Unesite broj: -4
//        Unesite broj: 3
//        Unesite broj: -7
//        Unesite broj: 9
//        Brojevi veci od nule u nizu A su: 1, 3, 9,

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        ArrayList<Integer> brojevi = new ArrayList<Integer>();
//        ArrayList<Integer> pozitivni = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N: ");
        int n = s.nextInt();
        int broj = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj: ");
            broj = s.nextInt();
            brojevi.add(broj);
        }
        System.out.print("Brojevi veci od nule u nizu A su: ");
        for (int i = 0; i < n; i++) {
            if (brojevi.get(i) > 0) {
                System.out.print(brojevi.get(i) + ", ");
            }

        }
        }
}

//        if (broj > 0){
//        veciOdNule = veciOdNule + broj + ", ";

//        System.out.print("Brojevi veci od nule u nizu A su: " + pozitivni);
//        for (int i = 0; i < n; i++) {
//           if (broj > 0) {
//               System.out.print(broj + ", ");
//            }
        //            if (brojevi.get(i) > 0) {
//                System.out.print("Brojevi veci od nule u nizu A su: " + i + ", ");
//            }
//            if (broj > 0){
//                pozitivni.add(broj);
//            }



