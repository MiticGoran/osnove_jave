package domaci_19_01_2023;
//        Zadatak
//        Kreirati abstraktnu klasu Ambalaza koja ima:
//        barkod (primer: 328232-2823)
//        naziv artikla
//        neto tezinu
//        bruto tezinu
//        konstuktore (default-ni i sa parametrima)
//        gettere i settere
//        metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
//        abstraktnu metodu koja vraca cenu artikla
//        abstraktnu metodu stampaj
//
//        Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//        atribut koji kaze da li se moze reciklirati
//        osnovna cena
//        gettere i setter za atribute
//        konstuktori koji su vam potrebni
//        racuna cenu tako da ispunjava uslova:
//        ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//        ako nije u cenu ulazi samo osnovna cena
//        metoda stampaj stampa sve podatke iz klase tetrapak.
//
//        Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//        kaucija za flasu
//        atribut koji kaze da li se za flasu placa kaucija
//        osnovna cena
//        gettere i setter za atribute
//        konstuktori koji su vam potrebni
//        racuna cenu
//        ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//        ako se ne placa, (osnovna cena) * 1.2
//        metoda stampaj stampa sve podatke iz klase staklena flasa.
//
//        Kreirati klasu SuperKartica koja ima:
//        broj kartice
//        ime i prezime vlasnika
//        popust (200, 500, … )
//        konstuktore (default-ni i sa parametrima)
//        gettere i settere
//        metodu stampaj koja stampa karticu u formatu:
//        (broj kartice), (ime i prezime)
//
//        Kreirati klasu Korpa koja ima:
//        niz ambalaza
//        metodu dodaj ambalazu
//        metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//        privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust.
//        metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije
//        se prima Super karticu iz koje se cita popust.
//
//        U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih tipova i
//        istestirati sve metode i ispisati ukupnu cenu sa popustom.

public class Zadatak1Korpa {
    public static void main(String[] args) {
        Korpa k1 = new Korpa();
        SuperKartica s1 = new SuperKartica("881", "Goran Mitic", 50);

        Ambalaza a1 = new Tetrapak("1238", "Cokoladno Mleko", 200,
                230, true, 100);
        Ambalaza a2 = new Tetrapak("1239", "Sok", 1000,
                1060, true, 180);

        Ambalaza a3 = new StaklenaAmbalaza("2341", "Sprite", 300,
                350, 20, false, 80);
        Ambalaza a4 = new StaklenaAmbalaza("2342", "Zajecarac", 500,
                560, 25, true, 75);

        k1.dodajAmbalazu(a1);
        k1.dodajAmbalazu(a2);
        k1.dodajAmbalazu(a3);
        k1.dodajAmbalazu(a4);

        a3.stampaj();
        s1.stampaj();
        System.out.println("Ukupna cena korpe: " + k1.ukupnaCenaKorpe(s1));

    }
}
