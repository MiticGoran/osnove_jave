package domaci_29_12_2022;

public class Zadatak2 {
    public static void main(String[] args) {
        FacebookPost f1 = new FacebookPost();
        f1.setImeKorisnikaKojiJeObjavio("Goran Mitic");
        f1.setImeKorisnikaGdeJeObjavljen("Pera Peric");
        f1.setObjava("Ovo je tekst objave.");

        FacebookPost f2 = new FacebookPost();
        f2.setImeKorisnikaKojiJeObjavio("Stefan Stefic");
        f2.setImeKorisnikaGdeJeObjavljen("Pera Petrovic");
        f2.setObjava("Ovo je tekst objave broj 2.");


        f1.like();
        f1.like();
        f1.like();
        f1.dislike();
        f1.dislike();
        f1.share();
        f1.print();

        f2.like();
        f2.dislike();
        f2.like();
        f2.share();
        f2.share();
        f2.print();
    }
}
