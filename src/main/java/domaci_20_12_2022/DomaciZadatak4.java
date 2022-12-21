package domaci_20_12_2022;

//        Napisati program koji proverava uparenost zagrada.
//        Korisnik unosi matematicku formulu sve dok ne unese znak =.
//        Korisnik unosi svaki karakter jednacine posebno i na kraju programa se ispisuje
//        da li su sve zagrade uparene.
//        Formula koja se koristi u primeru je: (2 * ( 1 + 3))=
//        Primer izvrsenja:
//        Unos: (
//        Unos: 2
//        Unos: *
//        Unos: (
//        Unos: 1
//        Unos: +
//        Unos: 3
//        Unos: )
//        Unos: )
//        Unos: =
//        Zagrade su uparene
//        (Objasnjenje: Imamo isti broj otvorenih i zatvorenih zagrada)


import java.util.Scanner;
public class DomaciZadatak4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String unos = "";
        int counter1 = 0;
        int counter2 = 0;

        while (!(unos.equals("="))){
            System.out.println("Unos: ");
            unos = s.next();
            if (unos.equals("(")){
                counter1++;
            } else if (unos.equals(")")) {
                counter2++;
            }

        }
        if (counter1 == counter2){
            System.out.println("Zagrade su uparene.");
        } else {
            System.out.println("Zagrade nisu uparene.");
        }


    }
}
