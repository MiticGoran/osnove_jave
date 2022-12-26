package p26_12_2022;

//        Napisati metodu koja vraca suprotno negativni broj od prosledjenog.
//        Metoda prima broj N i vraca ga sa negativnom vrednoscu.
//        Primer: Ako se metoda pozove za N=10, vraca -10
//        Ako se metoda pozove za N=-11, vraca 11

public class Zadatak7 {
    public static void main(String[] args) {
    int x = negativnaVrednost(10);
        System.out.println(x);
    }

    public static int negativnaVrednost(int x){
        if (x > 0) {
        return -x;
        } else if (x < 0) {
            return x;
        } else {
            return 0;
        }

    }
}
