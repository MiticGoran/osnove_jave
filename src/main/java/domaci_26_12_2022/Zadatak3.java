package domaci_26_12_2022;

import java.util.Scanner;

//        Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije
//        vraca novu vrednost koja se formira kao na primeru. METODA NISTA NE STAMPA.
//        ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//        ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.
public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite a: ");
        int a = s.nextInt();
        System.out.println("Unesite b: ");
        int b = s.nextInt();
        System.out.println(dvocifrenBroj(a, b));
    }
    public static int dvocifrenBroj(int x, int y){
        int z = x * 10 + y;
        return z;
    }
}
