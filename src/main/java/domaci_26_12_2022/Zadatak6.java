package domaci_26_12_2022;
//        Napisati funkciju koja vrsi konverziju eura u dinare, rublje ili dolare prema dole navedenoj konverziji.
//        Metoda od parametara prima vrednost u eurima kao i valutu u kojoj je potrebno izvrsiti
//        konverziju (RSD/USD/RUB) a vraca konvertovanu vrednost.
//        U glavnom programu pozvati funkciju za neki od primera.
//        Primer poziva funkcija:
//        Ako se za vrednost u eurima unese 3 i valuta RSD vraca vrednost 351.6339
//        Ako se za vrednost u eurima unese 4.5 i valuta USD vraca vrednost 5.31945
//        Primer izvrsenja main programa:
//        Unesite vrednost u eurima: 3
//        Unesite valutu za konverziju: RSD
//        3 EUR je 351.6339 RSD
//        Konverzija eura u druge valute:
//        1 EUR = 117.5 RSD
//        1 EUR = 1.1 USD
//        1 EUR = 62.98 RUB

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite vrednost u evrima: ");
        double euro = s.nextDouble();
        System.out.println("Unesite valutu za konverziju: ");
        String valuta = s.next();
        konverzija(valuta, euro);
    }
    public static void konverzija(String valuta, double euro){
        if (valuta.equals("RSD")){
            double rsdEuro = euro * 117.5;
            System.out.println(euro + " EUR je " + rsdEuro + " RSD");
        } else if (valuta.equals("USD")) {
            double usdEuro = euro * 1.1;
            System.out.println(euro + " EUR je " + usdEuro + " USD");
        } else if (valuta.equals("RUB")) {
            double rubEuro = euro * 62.98;
            System.out.println(euro + " EUR je " + rubEuro + " RUB");
        } else {
            System.out.println("Pogresna valuta!");
        }
    }

}
