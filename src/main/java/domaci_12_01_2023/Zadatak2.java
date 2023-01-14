package domaci_12_01_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        Racun r1 = new Racun("12342251", "Goran Mitic", 120050.00);
        Racun r2 = new Racun("44212332", "Pera Peric", 25600.5);
        Transakcija t1 = new Transakcija("8443", r1, r2);
        r1.stampajPodatkeRacun();
        r2.stampajPodatkeRacun();
        t1.stampajPodatkeOTransakciji();
        t1.izvrsiTransakciju(1000);
        t1.stampajPodatkeOTransakciji();
        t1.izvrsiTransakciju(10000);
        t1.stampajPodatkeOTransakciji();
    }
}
