package domaci_20_12_2022;

//        Napisati program koji od korisnika ucitava brojeve sve dok ne unesu bar dve dvojke ili tri jedinice.
//        Primer izvrsenja 1:
//        Unesite broj:1
//        Unesite broj:2
//        Unesite broj:0
//        Unesite broj:2
//        Kraj programa.
//        (Objasnjenje: Kraj jer je uneto dve dvojke)
//
//        Primer izvrsenja 1:
//        Unesite broj:1
//        Unesite broj:2
//        Unesite broj:1
//        Unesite broj:3
//        Unesite broj:1
//        Kraj programa.
//        (Objasnjenje: Kraj jer je uneto tri jedinice)

import java.util.Scanner;

public class DomaciZadatak3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int broj = 0;
        int counter1 = 0;
        int counter2 = 0;

        while(counter1 != 2 && counter2 != 3){
            System.out.println("Unesite broj: ");
            broj = s.nextInt();
            if (broj == 2){
                counter1++;
            } else if (broj == 1) {
                counter2++;
            }
        }
        System.out.println("Kraj programa.");
    }
}
