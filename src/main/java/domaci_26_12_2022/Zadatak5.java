package domaci_26_12_2022;
//        Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//        Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se
//        / / / / /
//        Napomena: Metoda nista ne vraca.

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N: ");
        int broj = s.nextInt();
        System.out.println("Unesite karakter: ");
        String karakter = s.next();
        crtice(broj, karakter);
    }
    public static void crtice(int n, String crta){
        for (int i = 0; i < n; i++) {
            System.out.print(crta);
        }
    }
}
