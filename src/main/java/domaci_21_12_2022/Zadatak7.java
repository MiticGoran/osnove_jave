package domaci_21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite velicinu fajla: ");
        int velicinaFajla = s.nextInt();
        String newBlok = "";
        int blokBroj = 1;

        while (((blokBroj * 100) / velicinaFajla) < velicinaFajla) {
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
