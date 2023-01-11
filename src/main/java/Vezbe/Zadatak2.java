package Vezbe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//    Zadatak (For petlja)
//    Napisati program koji simulira sumiranje vrednosti po koloni u eksel tabeli.
//    Program ima niz brojeva duzine 25, koji izgleda kao tabela 5x5, niz je sa fiksnim vrednostima
//    tj. ne unosi ih korisnik. Program stampa tabelu na ekranu a zatim od korisnika trazi da unese
//    kolonu po kojoj bi zeleo da sumira vrednosti i na kraju programa ispisuje sumu za trazenu kolonu.
//    POGLEDAJ SLIKU
//    Primer izvrsenja:
//    3,1,8,0,1,
//    1,5,7,9,6,
//    3,1,6,5,1,
//    4,5,8,1,7,
//    1,3,2,8,0,
//    Unesite kolonu za sumiranje: 2
//    uma je 31 (Objasnjenje: jer se sumira 8+7+6+8+2, pogledaj sliku)
public class Zadatak2 {
    public static void main(String[] args) {
        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        brojevi.add(3);
        brojevi.add(1);
        brojevi.add(8);
        brojevi.add(0);
        brojevi.add(1);
        brojevi.add(1);
        brojevi.add(5);
        brojevi.add(7);
        brojevi.add(9);
        brojevi.add(6);
        brojevi.add(3);
        brojevi.add(1);
        brojevi.add(6);
        brojevi.add(5);
        brojevi.add(1);
        brojevi.add(4);
        brojevi.add(5);
        brojevi.add(8);
        brojevi.add(1);
        brojevi.add(7);
        brojevi.add(1);
        brojevi.add(3);
        brojevi.add(2);
        brojevi.add(8);
        brojevi.add(0);

        for (int i = 0; i < 25; i++) {
            System.out.print(brojevi.get(i) + ",");
            if((i + 1) % 5 == 0){
                System.out.println();
            }
        }

        System.out.println("Unesite kolonu: ");
        int kolona = s.nextInt();
        int suma = 0;
        for (int i = 0; i < 25; i+=5) {
            suma = suma + brojevi.get(kolona + i);
        }
        System.out.println(suma);

    }
}
