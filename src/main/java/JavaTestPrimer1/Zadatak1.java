package JavaTestPrimer1;

import java.util.Scanner;

//        Napisati program koji za unetu visinu i težinu osobe računa indeks telesne
//        mase (BMI) i na osnovu tog rezultata osobu raspoređuje u jednu od četiri kategorije.
//        BMI se računa po formuli BMI = tezina u kg / (visina u m)2
//        dok se kategorija određuje prema tabeli 1.1.
//        Tabela 1.1 Određivanje kategorije na osnovu indeksa telesne mase
//        Primer izvrsenja: Unesite tezinu osobe (kg): 110
//        Unesite visinu osobe (m): 1.9
//        Kategorija je Gojaznost
public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite tezinu osobe (kg): ");
        double tezina = s.nextDouble();
        System.out.println("Unesite visinu osobe (m): ");
        double visina = s.nextDouble();
        double bmi = tezina / (visina * visina);
        if(bmi < 18.5){
            System.out.println("Kategorija je neuhranjenost.");
        } else if (bmi < 24.99 && bmi > 18.5) {
            System.out.println("Kategorija je normalna tezina.");
        } else if (bmi < 29.99 && bmi > 25) {
            System.out.println("Kategorija je prekomerena tezina.");
        } else if (bmi >= 30){
            System.out.println("Kategorija je gojaznost.");
        }
    }
}
