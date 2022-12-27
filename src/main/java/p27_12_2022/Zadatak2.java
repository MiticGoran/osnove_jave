package p27_12_2022;

public class Zadatak2 {
    public static void main(String[] args) {
        SlackMessage poruka1 = new SlackMessage();
        poruka1.tekstPoruke = "Klase su laganica.";
        poruka1.imeIPrezime = "Goran Mitic";
        poruka1.datum = "27.12.2022";

        SlackMessage poruka2 = new SlackMessage();
        poruka2.tekstPoruke = "Onda ce biti na testu.";
        poruka2.imeIPrezime = "Milan Jovanovic";
        poruka2.datum = "27.12.2022";

        poruka1.stampaj();
        poruka2.stampaj();
    }
}
