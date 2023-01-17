package p17_01_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        StudentOsnovnih s1 = new StudentOsnovnih("Goran Mitic", 609, 4);
        StudentOsnovnih s2 = new StudentOsnovnih("Pera Peric", 611, 6);
        StudentMaster s3 = new StudentMaster("Peca Pecic", 629, 2);

        s1.stampaj();
        s2.stampaj();
        s3.stampaj();
    }
}
