package p14_12_2022;

import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {

        int zvuk = 75;
        System.out.println("Jacina zvuka je: " + zvuk);

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite akciju: ");
        String noviZvuk = s.next();

        if (noviZvuk.equals("pojacaj")){
            zvuk = zvuk + 10;
            System.out.println("Nova jacina zvuka je " + zvuk);
        }else if(noviZvuk.equals("smanji")){
            zvuk = zvuk - 10;
            System.out.println("Nova jacina zvuka je " + zvuk);
        }else if (noviZvuk.equals("mute")) {
            zvuk = zvuk * 0;
            System.out.println("Nova jacina zvuka je " + zvuk);
        }



    }
}
