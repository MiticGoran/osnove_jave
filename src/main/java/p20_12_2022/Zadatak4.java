package p20_12_2022;

//        Zadatak
//        Napisati program koji radi bipovanje ruznih reci. Program radi za jednu recenicu,
//        sto znaci da ucitava od korisnika rec po rec sve dok se ne unese rec sa tackom.
//        Za reci koje su nepristojne ispisuje beeeeeeeeeeeeep.
//        Ruzne reci koje program prepoznaje su:
//        zajebava
//        mars
//        stoko
//        svinjo
//        Unesite rec: Jel
//        Jel
//        Unesite rec:ti
//        ti
//        Unesite rec:to
//        to
//        Unesite rec:mene
//        mene
//        Unesite rec:zajebavas
//        beeeeeeeeeep
//        Unesite rec:stoko
//        beeeeeeeeeep
//        Unesite rec:jedna.
//        jedna.
//        Kraj programa.


import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String rec = "da";
        while (!(rec.contains("."))) {
            System.out.println("Unesite rec: ");
            rec = s.next();
            if(rec.contains("zajebavas") || rec.contains("mars") || rec.contains("stoko") || rec.contains("svinjo")){
                System.out.println("beeeeeep");
            } else {
                System.out.println(rec);
            }
        }
        System.out.println("Kraj programa.");
    }


}

