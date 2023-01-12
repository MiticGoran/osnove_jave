package p12_01_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        FizickoLice f1 = new FizickoLice("Goran Mitic", "04232492",
                "2123124", true);
        Ugovor u1 = new Ugovor("12.01.2023", "Pera Peric", f1,
                36000, "Dusanova, 99, Nis");

        f1.stampaj();
        u1.stampajUgovor();

    }
}
