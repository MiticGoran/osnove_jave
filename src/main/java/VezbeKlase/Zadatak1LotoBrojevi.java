package VezbeKlase;
        //Zadatak (Za vezbanje)
//        Napomena: U zadacima su brojevi od 1 do 39, i smatrajte da se brojevi unose u tim granicama.
//        Znaci nije vam potrebna provera za opseg brojeva.
//
//        Za potrebe Lotto igre na srecu potrebno je
//        Kreirati klasu Kombinacija koja ima:
//        id kombinacije (String)
//        niz brojeva - niz je od 7 broja (ArrayList<Integer>)
//        konstruktor koji prima id i 7 broja koji se u konstruktoru dodaju u niz.
//        gettere za atribute Kombinacija(String id, int jedan, int dva, …)
//        metodu koja proverava da li this kombinacija ima iste brojeve kao prosledjena kombinacija.
//        Zaglavlje metode je:
//          public boolean daLiJeIstaKombinacija( Kombinacija k)
//        metoda vraca true ako su svi elementi na istim pozicija isti
//        npr: this [0] == k [0], this [1] == k [1] ….
//        metodu za stampu koja stampa podatke u formatu
//        ID: id kombinacije
//        brojevi: 1, 3, 5, 14, 15, 21, 23
//
//        Kreirati klasu Listic koja ima:
//        niz kombinacija - maksimalno 7 kombinacija
//        metodu dodaj kombinaciju, koja dodaje kombinaciju u niz
//        metodu koja vraca da li je kombinacija dobitna. Kao parametar se prosledjuje kombinacija za proveru.
//        Metoda prolazi kroz sve elemente niza i proverava da li u nizu postoji prosledjena kombinacija.
//        Za proveru jednakosti kombinacja koristi se metoda daLiJeIstaKombinacija
//        Zaglavlje metode
//          public boolean dobitna(Kombinacija dobitnaKombinacija)
//        metodu koja stampa listic u formatu
//        ID: id kombinacije
//        brojevi: 1, 3, 5, 14, 15, 21, 23
//
//        ID: id kombinacije
//        brojevi: 1, 3, 5, 14, 15, 21, 23
//
//        …… i tako za sve kombinacije

public class Zadatak1LotoBrojevi {
    public static void main(String[] args) {
        Kombinacija sedmica = new Kombinacija("izvucenih7", 3, 5, 11, 18,
                23,28,38);
        Kombinacija k1 = new Kombinacija("id1", 1,8,11,13,14,25,37);
        Kombinacija k2 = new Kombinacija("id2", 3,5,11,18,23,28,38);
        Kombinacija k3 = new Kombinacija("id3",3,8,11,12,22,34, 36);
        Listic l1 = new Listic();

        l1.dodajKombinaciju(k1);
        l1.dodajKombinaciju(k2);
//        l1.dodajKombinaciju(sedmica);
        l1.dodajKombinaciju(k3);

        k1.stampajKombinaciju();

        System.out.println("Da li je kombinacija ista? " + k2.daLiJeIstaKombinacija(k1));

        System.out.println("Da li je izvucena sedmica? " + l1.izvucenaSedmica(sedmica));

    }
}
