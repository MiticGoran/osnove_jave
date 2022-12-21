package p21_12_2022;

import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {

        ArrayList<Integer> brojevi =  new ArrayList<Integer>();

        brojevi.add(10);
        brojevi.add(20);
        brojevi.add(30);
        brojevi.add(40);
        brojevi.add(50);

        int x = brojevi.get(3) * 10;
        brojevi.set(3, x);

//        brojevi.set(3, brojevi.get(3) * 10);
//        int pos3 = brojevi.get(3);
//        int brojX10 = pos3 * 10;
//
//        System.out.println(brojevi.set(3, brojX10));








    }
}
