package JavaTest;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite lozinku: ");
        String lozinka = s.next();
        int counter = 0;
        int counter2 = 0;

        while(counter != 4){
            System.out.println("Potvrdite lozinku: ");
            String potvrdjenaLozinka = s.next();
            if (potvrdjenaLozinka.equals(lozinka)){
                System.out.println("Lozinka je uspesno postavljena!");
                counter = 4;
            } else {
                System.out.println("Lozinke se ne poklapaju.");
                counter++;
                counter2++;
            }
            if (counter2 == 4){
                System.out.println("Mogucnost postavljanja lozinke je blokirana.");
            }
        }
    }
}
