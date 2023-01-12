package p12_01_2023;

import java.util.ArrayList;

public class Zadatak4 {
    public static void main(String[] args) {
        ArrayList<Sastojak> sastojci = new ArrayList<Sastojak>();
        Sastojak s1 = new Sastojak("Prvi sastojak", 20);
        Sastojak s2 = new Sastojak("Drugi sastojak", 25);
        Sastojak s3 = new Sastojak("Trec sastojak", 43);
        sastojci.add(s1);
        sastojci.add(s2);
        sastojci.add(s3);

        for (int i = 0; i < sastojci.size(); i++) {
            System.out.println(sastojci.get(i).getNazivSastojka() + ", " + sastojci.get(i).getCenaSastojka());
        }
    }
}
