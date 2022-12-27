package domaci_26_12_2022;
//        Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
//        Primer izvrsenja:
//        izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
//        izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1
//        Napomena: Resiti bez koriscenja petlji.

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesi X: ");
        int x = s.nextInt();
        System.out.println("Unesi Y: ");
        int y = s.nextInt();
        System.out.println("Izmedju " + x + " i " + y + " je " + brojevi(x, y) + " brojeva.");

    }
    public static int brojevi(int x, int y){
        int z = x - y + 1;
        if (z < 0) {
            return -z;
        } else if (z > 0) {
            return z;
        } else {
            return 0;
        }
    }
}
