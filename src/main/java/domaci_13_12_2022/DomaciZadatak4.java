package domaci_13_12_2022;

public class DomaciZadatak4 {
    public static void main(String[] args) {

//        Napisati program koji racuna i ispisuje povrsinu i obim trougla. KOREN BROJA 3 neka bude konstanta 1.73.
//        Za stranicu trougla postavite proizvoljnu vrednost.
//        Primer izvrsenja programa:
//        a: 10
//        Povrsina je 43.25
//        Obim je 30

        int a = 10;
        int obimTrougla = 3 * a;
        double povrsinaTrougla = (a * a * 1.73) / 4;

        System.out.println("a: " + a);
        System.out.println("Obim trougla je " + obimTrougla);
        System.out.println("Povrsina trougla je " + povrsinaTrougla);

    }
}
