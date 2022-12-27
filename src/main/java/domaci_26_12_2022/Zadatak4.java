package domaci_26_12_2022;
//        Napisati metodu koja stampa podatke o korisniku u formatu:
//        JMBG: [jmbg]
//        Ime: [ime]
//        Prezime: [prezime]
//        God. rodjenja: [god]
//        Aktivan: [true/false]
//        Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.
//        Metoda nista ne vraca.

public class Zadatak4 {
    public static void main(String[] args) {
        podaci("0403212322312", "Goran" , "Mitic", 1991, true );
    }
    public static void podaci(String jmbg, String ime, String prezime, int godinaRodjenja, boolean aktivan){
        System.out.println("JMBG: " + jmbg);
        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("Godina rodjenja: " + godinaRodjenja);
        System.out.println("Aktivan: " + aktivan);
    }
}
