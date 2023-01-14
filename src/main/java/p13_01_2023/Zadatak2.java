package p13_01_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        Reakcija r1 = new Reakcija("like", "Goran Mitic");
        Reakcija r2 = new Reakcija("like", "Pera Peric");
        Reakcija r3 = new Reakcija("heart", "Stefan Stefanovic");
        Reakcija r4 = new Reakcija("smiley", "Petar Miric");

        FacebookPost f1 = new FacebookPost(r1.getImeIPrezimeKorisnika(), "Nesto tamo");
        f1.reaguj(r1);
        f1.reaguj(r3);
        f1.reaguj(r4);
        f1.reaguj(r2);
        f1.stampaj();

    }
}
