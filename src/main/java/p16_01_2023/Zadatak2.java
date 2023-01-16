package p16_01_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        VisaKartica v1 = new VisaKartica(12000,"4012-1239-1221-3381", "2024",
                "04", "Goran Mitic");
        MasterKartica m1 = new MasterKartica(15000, "3252-3239-3226-2831",
                "2025", "06");

        v1.stampaj();
        v1.izvrsiTransakciju(2000);
        v1.stampaj();
        m1.stampaj();
        m1.izvrsiTransakciju(1500);
        m1.stampaj();
    }
}
