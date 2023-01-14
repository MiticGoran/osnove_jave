package p13_01_2023;

import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {
        Sastojak s1 = new Sastojak("So", 115.5);
        Sastojak s2 = new Sastojak("Secer", 101);
        Sastojak s3 = new Sastojak("Brasno", 99.99);
        Pasta p1 = new Pasta();
        p1.dodajSastojak(s1);
        p1.dodajSastojak(s2);
        p1.dodajSastojak(s3);
        p1.obrisiSastojak("So");
        p1.printData();






    }
}
