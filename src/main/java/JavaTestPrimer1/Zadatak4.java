package JavaTestPrimer1;
//         Napisati funkciju koja vrsi konverziju eura u dinare, rublje ili dolare prema dole navedenoj
//         konverziji. Metoda od parametara prima vrednost u eurima kao i valutu u kojoj je potrebno
//         izvrsiti konverziju (RSD/USD/RUB) a vraca konvertovanu vrednost.
//         U glavnom programu pozvati funkciju za neki od primera.
//         Primer poziva funkcija:
//         Ako se za vrednost u eurima unese 3 i valuta RSD vraca vrednost 350.1
//         Ako se za vrednost u eurima unese 4.5 i valuta USD vraca vrednost 4.995
//         Primer izvrsenja main programa:
//         Unesite vrednost u eurima: 3
//         Unesite valutu za konverziju: RSD
//         3 EUR je 350.1 RSD
//         Konverzija eura u druge valute:
//         1 EUR = 116.70 RSD
//         1 EUR = 1.11 USD
//         1 EUR = 89.24 RUB

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite vrednost u EUR: ");
        double eur = s.nextDouble();
        System.out.println("Unesite valutu za konverziju: ");
        String valuta = s.next();
        konverzija(eur, valuta);
    }

    public static void konverzija(double eur, String valuta){
        if (valuta.equals("RSD")){
            double novac = eur * 116.70;
            System.out.println(eur + " EUR je " + novac + " RSD");
        } else if (valuta.equals("RUB")) {
            double novac = eur * 89.24;
            System.out.println(eur + " EUR je " + novac + " RUB");
        } else if (valuta.equals("USD")) {
            double novac = eur * 1.11;
            System.out.println(eur + " EUR je " + novac + " USD");
        }
    }
}
