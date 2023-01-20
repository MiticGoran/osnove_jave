package p19_01_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        PoreskaUprava p1 = new PoreskaUprava("Krusevac");
        Objekat o1 = new Kuca("Dusanova, 33", 110, 3, 3);
        Objekat o2 = new Zgrada("Glavna, 1", 500, 1, 10);
        Objekat o3 = new Lokal("Glavna, 3", 500, 1);
        p1.dodajObjekat(o1);
        p1.dodajObjekat(o2);
        p1.dodajObjekat(o3);
        p1.stampajSveObjekte();
        System.out.println("Ukupan porez za grad: " + p1.ukupanPorezZaGrad("Krusevac"));
    }
}
