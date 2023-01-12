package p12_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        Korisnik k1 = new Korisnik("Goran Mitic");
        Korisnik k2 = new Korisnik("Pera Peric");
        ZoomCall z1 = new ZoomCall("link123", "123pass", k1, k2);

        k1.pretplatiSe(150);
        k2.pretplatiSe(100);
        z1.pokreniPoziv();


    }
}
