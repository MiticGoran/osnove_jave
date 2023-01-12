package domaci_29_12_2022;

public class Zadatak1 {
    public static void main(String[] args) {
        Proizvod p1 = new Proizvod();
        p1.nazivProizvoda = "Kokos";
        p1.tezinaGram = 200;
        p1.cenaProizvoda = 80;
        Proizvod p2 = new Proizvod();
        p2.nazivProizvoda = "Brasno";
        p2.tezinaGram = 600;
        p2.cenaProizvoda = 90;

        p1.stampaj();
        p1.povecajCenu(10);
        System.out.println("Postarina: " + p1.racunajPostarinu());
        System.out.println("Cena sa popustom: " + p1.vratiCenuSaPopustom(50));;
        System.out.println();
        p2.stampaj();
        p2.povecajCenu(20);
        System.out.println("Postarina: " + p2.racunajPostarinu());
        System.out.println("Cena sa popustom: " + p2.vratiCenuSaPopustom(40));;


    }
}
