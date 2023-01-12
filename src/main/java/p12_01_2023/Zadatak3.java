package p12_01_2023;

public class Zadatak3 {
    public static void main(String[] args) {
        ViberKorisnik k1 = new ViberKorisnik("Goran Mitic", "069555333", true);
        ViberKorisnik k2 = new ViberKorisnik("Pera Peric", "062553777", false);
        ViberPoruka p1 = new ViberPoruka("Neki Tekst poruke", "22:13", k1, k2);

        p1.stampajViber();
    }
}
