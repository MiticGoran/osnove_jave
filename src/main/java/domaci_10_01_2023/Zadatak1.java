package domaci_10_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        Autor a1 = new Autor("Goran", "Mitic");
        Autor a2 = new Autor("Pera", "Peric");
        Autor a3 = new Autor("Petar", "Petrovic");
        Knjiga k1 = new Knjiga("123", "Knjiga broj 1", 1984, a1);
        Knjiga k2 = new Knjiga("124", "Knjiga broj 2", 1988, a1);
        Knjiga k3 = new Knjiga("127", "Knjiga broj 3", 1999, a2);
        Knjiga k4 = new Knjiga("121", "Knjiga broj 4", 1982, a3);

        k1.stampajKnjigu();
        k4.stampajKnjigu();
        a2.stampajAutora();

    }
}
