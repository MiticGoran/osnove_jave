package domaci_26_12_2022;
//        Napisati metodu koja vrsi spajanje punog imena i vraca tu vrednost.
//        Metoda od parametara prima ime i prezime (2 parametra) i vraca jedan string tako sto spoji ime i prezime.
//        METODA NISTA NE STAMPA.
//        Primer poziva: Ako se metoda pozvoe za ime=”Milan” i prezime=”Jovanovic”, metoda vraca “Milan Jovanovic”

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite ime: ");
        String ime = s.next();
        System.out.println("Unesite prezime: ");
        String prezime = s.next();
        System.out.println("Ime i prezime su: " + imePrezime(ime, prezime));

    }
    public static String imePrezime(String ime, String prezime){
        String imeIPrezime = ime + " " + prezime;
        return imeIPrezime;
    }
}
