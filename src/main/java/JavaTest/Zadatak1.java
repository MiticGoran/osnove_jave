package JavaTest;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite ime prve osobe: ");
        String prvaOsoba = s.next();

        System.out.println("Unesite godinu rodjenja prve osobe: ");
        int godPrvaOsoba = s.nextInt();

        System.out.println("Unesite mesec rodjenja prve osobe: ");
        int mesPrvaOsoba = s.nextInt();

        System.out.println("Unesite dan rodjenja prve osobe: ");
        int danPrvaOsoba = s.nextInt();

        System.out.println("Unesite ime druge osobe: ");
        String drugaOsoba = s.next();

        System.out.println("Unesite godinu rodjenja druge osobe: ");
        int godDrugaOsoba = s.nextInt();

        System.out.println("Unesite mesec rodjenja druge osobe: ");
        int mesDrugaOsoba = s.nextInt();

        System.out.println("Unesite dan rodjenja druge osobe: ");
        int danDrugaOsoba = s.nextInt();

        if(godPrvaOsoba > godDrugaOsoba){
            System.out.println(drugaOsoba + " je stariji.");
        } else if (godPrvaOsoba < godDrugaOsoba) {
            System.out.println(prvaOsoba + " je stariji.");
        } else if (godPrvaOsoba == godDrugaOsoba && mesPrvaOsoba == mesDrugaOsoba && danPrvaOsoba == danDrugaOsoba){
            System.out.println("Iste su starosti.");
        } else if (godPrvaOsoba == godDrugaOsoba && mesPrvaOsoba > mesDrugaOsoba) {
            System.out.println(drugaOsoba + " je stariji.");
        } else if (godPrvaOsoba == godDrugaOsoba && mesPrvaOsoba == mesDrugaOsoba && danPrvaOsoba > danDrugaOsoba) {
            System.out.println(drugaOsoba + " je stariji.");
        } else if (godPrvaOsoba == godDrugaOsoba && mesPrvaOsoba < mesDrugaOsoba) {
            System.out.println(prvaOsoba + " je stariji.");
        } else if (godPrvaOsoba == godDrugaOsoba && mesPrvaOsoba == mesDrugaOsoba && danPrvaOsoba < danDrugaOsoba) {
            System.out.println(prvaOsoba + " je stariji.");
        }
    }
}
