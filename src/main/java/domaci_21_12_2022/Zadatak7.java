package domaci_21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

//        Za vezbanje jedan
//        Uvod: Skidanje fajla je po blokovima, u praksi ti blokovi su fiksne velicine ali
//        nas program radi za proizvoljnu velicinu bloka.
//        Napisati metodu koja simulira download fajla. Fajl je tekstualnog tipa.
//        Na pocetku programa korisnik unosi velicinu fajla (broj karaktera koji se skida) a zatim se
//        sa tastature unosi niz spojenih karaktera (simulacija skinutog bloka) i ispisuje se napredak skidanja.
//        Program radi dok se ne skine ceo fajl. Na kraju programa stampa se sadrzaj skinutog fajla.
public class Zadatak7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite velicinu fajla: ");
        int velicinaFajla = s.nextInt();
        String newBlok = "";
        int blokBroj = 1;

        while (((blokBroj * 100) / velicinaFajla) < 100) {
            System.out.println("Unesite blok: ");
            String blok = s.next();
            newBlok = newBlok + blok;
            blokBroj = newBlok.length();
            if (((blokBroj * 100) / velicinaFajla) < 100){
                System.out.println("Downloaded " + ((blokBroj * 100) / velicinaFajla) + "%");
            } else {
                System.out.println("Downloaded 100%");
            }
        }

    }
}
