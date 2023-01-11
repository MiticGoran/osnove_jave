package JavaTest;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite donju granicu toplomera: ");
        int donjaGranica = s.nextInt();
        System.out.println("Unesite gornju granicu toplomera: ");
        int gornjaGranica = s.nextInt();

        for (int i = gornjaGranica; i > donjaGranica - 1; i--) {
            System.out.println("|-" + i + "|");
        }
        System.out.println(" | " + "| ");
        System.out.println(" | " + "| ");
    }
}
