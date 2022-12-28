package domaci_27_12_2022;

public class Zadatak1 {
    public static void main(String[] args) {
        Proizvod proizvod1 = new Proizvod();
        proizvod1.naziv = "Brasno";
        proizvod1.cena = 100;
        proizvod1.tezinaGram = 1200;

        Proizvod proizvod2 = new Proizvod();
        proizvod2.naziv = "So";
        proizvod2.cena = 80;
        proizvod2.tezinaGram = 3200;

        proizvod1.stampaj();
        System.out.println("Tezina u kg: " + proizvod1.konvertuj("kg"));
        proizvod2.stampaj();
        System.out.println("Tezina u t: " + proizvod2.konvertuj("t"));

    }
}
