package p16_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        Student s1 = new Student("Goran Mitic", "04032424242",
                "609", 12500);
        Student s2 = new Student("Pera Peric", "15047414243",
                "611", 8500);

        Profesor p1 = new Profesor("Profa Profic", "29239239231",
                "Geomorfologija", 100000);
        Profesor p2 = new Profesor("Prefi Profic", "39149539238",
                "Hidrologija", 122000);
        s1.stampaj();
        s1.uplatiSkolarinu(3500.0);
        s1.stampaj();
        p1.stampaj();
        p1.povecajPlatu(10);
        p1.stampaj();
//        p2.stampajProfesora();
    }
}
