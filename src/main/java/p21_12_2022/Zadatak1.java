package p21_12_2022;

import java.util.ArrayList;

//        Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni)
//        i prikazuje sumu nultog i zadnjeg elementa tog niza.
public class Zadatak1 {

    public static void main(String[] args) {

        ArrayList<Integer> brojevi = new ArrayList<Integer>();

        brojevi.add(12);
        brojevi.add(32);
        brojevi.add(44);
        brojevi.add(62);
        brojevi.add(4);

        int lastIndex = brojevi.size() - 1;
        int suma = brojevi.get(0) + brojevi.get(lastIndex);

        System.out.println(suma);



    }
}
