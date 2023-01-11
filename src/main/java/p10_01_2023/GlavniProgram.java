package p10_01_2023;

public class GlavniProgram {
    public static void main(String[] args) {
        Tacka t1 = new Tacka();
        t1.setX(10);
        t1.setY(5);
        Tacka t2 = new Tacka(30, 40);
        t1.stampaj();
        t2.stampaj();

    }
}
