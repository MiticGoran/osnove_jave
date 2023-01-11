package JavaTest;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        ArrayList<Integer> parni = new ArrayList<Integer>();
        ArrayList<Integer> neparni = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N: ");
        int n = s.nextInt();
        int suma1 = 0;
        int suma2 = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();
            if (broj % 2 == 0){
                parni.add(broj);
                suma1 = suma1 + broj;
            } else {
                neparni.add(broj);
                suma2 = suma2 + broj;
            }
        }
        System.out.print("Niz parnih: ");
        for (int i = 0; i < parni.size(); i++) {
            System.out.print(parni.get(i) + ", ");
        }
        System.out.println();
        System.out.println("Suma parnih: " + suma1);

        System.out.print("Niz neparnih: ");
        for (int i = 0; i < neparni.size(); i++) {
            System.out.print(neparni.get(i) + ", ");
        }
        System.out.println();
        System.out.println("Suma parnih: " + suma2);
    }
}
