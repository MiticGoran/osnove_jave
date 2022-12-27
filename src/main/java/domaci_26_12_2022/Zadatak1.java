package domaci_26_12_2022;

import java.util.Scanner;

//        Napisati metodu stampajVrednostZa10Vecu u
//        kojoj se stampa prosledjena vrednost za 10 veca.Iz main-a pozvati izvrsenje metode za razlicite vrednosti.
public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite vrednost: ");
        int vrednost = s.nextInt();
        System.out.println("Vrednost veca za 10 je: " + stampajVrednostZa10Vecu(vrednost));
    }
    public static int stampajVrednostZa10Vecu(int x){
        int y = x + 10;
        return y;
    }

}
