package domaci_16_01_2023;

//          Zadatak
//        Kreirati klasu Osoba koja ima:
//        ime i prezime
//        jmbg
//        godinu rodjenja
//          default-ni konstuktor
//        konstuktor sa parametrima
//        gettere i settere
//        metodu stampaj koja stampa u formatu:
//        (ime i prezime), (jmbg), (godina rodjenja)
//
//        Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//        broj (broj koji igrac nosi)
//        poziciju koju igra (odbrambeni, napadac, … )
//        kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//          default-ni konstuktor
//        konstuktor sa parametrima
//        gettere i settere za broj, kapiten i poziciju
//        metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//        Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//        godine iskustva
//        tip trenera (kondicioni, za igru, pomocni, personalni)
//        metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
//
//        U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.
//
//
//        (Za vezbanje) U glavnom programu kreirati niz igraca i niz trenera,
//        na kraju programa ispisati sve igrace i trenere. Podatke za igrace i trenere unosi korisnik sa tastature.

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Igrac> igraci = new ArrayList<Igrac>();
        ArrayList<Trener> treneri = new ArrayList<Trener>();

        System.out.println("Koliko igraca zelite da dodate? ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            Igrac igracZaDodavanje = new Igrac();
            System.out.println("Unesite ime i prezime: "); // Spojeno ili samo ime
            igracZaDodavanje.setImeIPrezime(s.next());
            System.out.println("Unesite jmbg: ");
            igracZaDodavanje.setJmbg(s.next());
            System.out.println("Unesite godinu rodjenja: ");
            igracZaDodavanje.setGodinaRodjenja(s.nextInt());
            System.out.println("Unesite broj igraca: ");
            igracZaDodavanje.setBrojIgraca(s.next());
            System.out.println("Unesite poziciju igraca: ");
            igracZaDodavanje.setPozicija(s.next());
            System.out.println("Unesite da li je kapiten: ");
            igracZaDodavanje.setKapiten(s.nextBoolean());
            igraci.add(igracZaDodavanje);
        }

        System.out.println("Koliko trenera zelite da dodate? ");
        int t = s.nextInt();

        for (int i = 0; i < t; i++) {
            Trener trenerZaDodavanje = new Trener();
            System.out.println("Unesite ime i prezime: "); // Spojeno ili samo ime
            trenerZaDodavanje.setImeIPrezime(s.next());
            System.out.println("Unesite jmbg: ");
            trenerZaDodavanje.setJmbg(s.next());
            System.out.println("Unesite godinu rodjenja: ");
            trenerZaDodavanje.setGodinaRodjenja(s.nextInt());
            System.out.println("Unesite godine iskustva trenera: ");
            trenerZaDodavanje.setGodineIskustva(s.nextInt());
            System.out.println("Unesite tip trenera: ");
            trenerZaDodavanje.setTipTrenera(s.next());
            treneri.add(trenerZaDodavanje);
        }

        for (int i = 0; i < igraci.size() ; i++) {
            igraci.get(i).stampaj();
        }
        for (int i = 0; i < treneri.size() ; i++) {
            treneri.get(i).stampaj();
        }
    }
}
