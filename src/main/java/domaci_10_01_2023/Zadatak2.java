package domaci_10_01_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        ClanskaKarta c1 = new ClanskaKarta("1234-7890", 10);
        Kupac k1 = new Kupac("Goran Mitic", c1);
        Proizvod p1 = new Proizvod("Neki Proizvod", k1, 20);
        k1.stampajKupca();
        p1.stampajProizvod();
    }
}
