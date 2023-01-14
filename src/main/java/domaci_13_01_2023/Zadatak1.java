package domaci_13_01_2023;

import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {
        Student s1 = new Student("609", "Goran Mitic", "Osnovne");

        Ispit i1 = new Ispit("Hidrologija", 8, "Rasa Rasovic");
        Ispit i2 = new Ispit("Klimatologija", 9, "Radovan Petrovic");
        Ispit i3 = new Ispit("Geomorfologija", 6, "Peca Pecic");
        Ispit i4 = new Ispit("Naselja", 5, "Neko Nekic");

        s1.dodajIspit(i1);
        s1.dodajIspit(i2);
        s1.dodajIspit(i3);
        s1.dodajIspit(i4);
        s1.stampaj();

    }
}
