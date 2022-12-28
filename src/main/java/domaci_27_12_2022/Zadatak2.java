package domaci_27_12_2022;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SmartAirConditioning klima1 = new SmartAirConditioning();
        klima1.marka = "Midea";
        klima1.temperatura = 25;
        klima1.mod = "Greje";

        SmartAirConditioning klima2 = new SmartAirConditioning();
        klima2.marka = "Samsung";
        klima2.temperatura = 29;
        klima2.mod = "Hladi";

        klima1.print();
        klima2.print();
        System.out.println("Koja je temperatura napolju?");
        int napolju = s.nextInt();
        if (klima1.temperaturaNapolju(napolju)) {
            System.out.println(klima1.marka + ": Temperatura napolju je veca.");
        } else {
            System.out.println(klima1.marka + ": Temperatura napolju nije veca.");
        }
        if (klima2.temperaturaNapolju(napolju)) {
            System.out.println(klima2.marka + ": Temperatura napolju je veca.");
        } else {
            System.out.println(klima2.marka + ": Temperatura napolju nije veca.");
        }

    }
}
