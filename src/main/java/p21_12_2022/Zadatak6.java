package p21_12_2022;

//        Zadatak
//        Napisati progam koji stampa niz u obrnutom redosledu tj. od zadnjeg elementa do nultog.
//        Ako je niz 1,2,4,5,7, stampa se 7,5,4,2,1

import java.util.ArrayList;

public class Zadatak6 {
    public static void main(String[] args) {
        ArrayList<Integer> brojevi = new ArrayList<>();
        brojevi.add(10);
        brojevi.add(20);
        brojevi.add(30);
        brojevi.add(40);
        brojevi.add(50);

        for (int i = brojevi.size(); i > 0; i--) {
            System.out.print(i + ", ");
        }
    }

}
