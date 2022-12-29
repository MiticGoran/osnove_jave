package p27_12_2022;

public class Zadatak3 {
    public static void main(String[] args) {
        Auto prviAuto = new Auto();
        prviAuto.imeVozaca = "Goran Mitic";
        prviAuto.markaAuta = "Audi";
        prviAuto.brojVrata = 5;
        prviAuto.potrosnja = 6;
        prviAuto.brzina = 120;
        prviAuto.godinaProizvodnje = 2008;
        prviAuto.registracija = 12;
        prviAuto.kubikazaAuta = 1600;
        prviAuto.brojRegistracije = "KS-8000-MG";
        prviAuto.maksBrzina = 240;
        prviAuto.kapacitetRezervoara = 50;
        prviAuto.trenutnoGoriva = 20;

        prviAuto.print();

        System.out.println(prviAuto.prekoracenjeBrzine(100));
        System.out.println("Vasa kazna je " + prviAuto.kazna(100) + " dinara.");

        if (prviAuto.registracijaAuta(2)){
            System.out.println("Registrovan je.");
        } else {
            System.out.println("Nije registrovan");
        }

        if (prviAuto.oldtimer()){
            System.out.println("Jeste oldtimer.");
        }else {
            System.out.println("Nije oldtimer.");
        }

        System.out.println("Cena registracije je: " + prviAuto.cenaRegistracije());

        prviAuto.dodajGas();
        System.out.println("Trenutna brzina: " + prviAuto.brzina);
        System.out.println("Potrosnja je: " + prviAuto.trenutnaPotrosnja());
        prviAuto.stampajTablu();
        System.out.println(prviAuto.natociGorivo(20));


    }
}
