package p27_12_2022;
//      Kreirati klasu Racun koja ima
//		broj racuna (npr: 840-23932-323)
//		ime i prezime vlasnika
//		stanje na racunu
//		U mainu kreirati minimum dva racuna sa pratecim podacima i ostampati podatke za svaki objekat.


import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Racun racun1 = new Racun();
        racun1.stanjeRacuna = 1002089;
        racun1.imeIPrezime = "Goran Mitic";
        racun1.brojRacuna = "840-21321312-678";

        Racun racun2 = new Racun();
        racun2.stanjeRacuna = 3024031;
        racun2.imeIPrezime = "Stefan Stefanovic";
        racun2.brojRacuna = "840-81321319-673";

        System.out.println("Posaljilac: " + racun1.imeIPrezime + ", "
                            + racun1.brojRacuna + " , stanje: " + racun1.stanjeRacuna);
        System.out.println("Posaljilac: " + racun2.imeIPrezime + ", "
                + racun2.brojRacuna + " , stanje: " + racun2.stanjeRacuna);
        System.out.println("Unesite sumu za transakciju: ");
        int transakcija = s.nextInt();

        racun1.stanjeRacuna = racun1.stanjeRacuna - transakcija;
        racun2.stanjeRacuna = racun2.stanjeRacuna + transakcija;

        System.out.println("Posaljilac: " + racun1.imeIPrezime + ", "
                + racun1.brojRacuna + " , stanje: " + racun1.stanjeRacuna);
        System.out.println("Posaljilac: " + racun2.imeIPrezime + ", "
                + racun2.brojRacuna + " , stanje: " + racun2.stanjeRacuna);




    }
}
