package p13_12_2022;

public class Zadatak2 {
    public static void main(String[] args) {
//Napisati program koji na ekranu stampa podatke u formatu:
//Sifra [SIFRA PROIZVODA]
//[NAZIV PROIZVODA]  - $[CENA] - Popust [POPUST]%
//[BOJA], [VELICINA]
//Svaku informaciju za proizvod je potrebno cuvati u okviru zasebne promenljive.
//Primer izvrsenja:
//Sifra x932k20
//Nike Patike - $90 - Popust 13.5%
//Crna, 46.5

        String sifraProizvoda = "k33x34";
        String nazivProizvoda = "Monitor";
        double cena = 99.99;
        double popust = 11.5;
        String boja = "Crna";
        double velicina = 43.5;

        System.out.println("Sifra " + sifraProizvoda);
        System.out.println(nazivProizvoda + " - " + "$" + cena + " - " + " Popust " + popust + "%");
        System.out.println(boja + ", " + velicina);


    }
}
