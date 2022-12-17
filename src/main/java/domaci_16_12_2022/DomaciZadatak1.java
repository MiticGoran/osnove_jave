package domaci_16_12_2022;

import java.util.Scanner;

public class DomaciZadatak1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite x: ");
        int x = s.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.println((x + " x " + i) + " = " + (x * i));
        }

    }
}
