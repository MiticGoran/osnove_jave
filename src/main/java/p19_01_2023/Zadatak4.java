package p19_01_2023;

public class Zadatak4 {
    public static void main(String[] args) {
        Disciplina skok = new Disciplina("Skok u dalj", "skakanje");
        Disciplina sprint = new Disciplina("100m sprint", "trcanje");

        skok.dodajAtleticara(new Skakac("Goran Mitic", 9.1));
        skok.dodajAtleticara(new Skakac("Pera Peric", 8.9));
        skok.dodajAtleticara(new Skakac("Tamo Tamic", 7.4));

        skok.diskvalifikujAtleticara("Pera Peric");
        skok.stampajPobednika();

        sprint.dodajAtleticara(new Trkac("Peca Pecic", 8.1));
        sprint.dodajAtleticara(new Trkac("Neko Nekic", 8.0));
        sprint.dodajAtleticara(new Trkac("Jeste Jestic", 8.6));

        sprint.diskvalifikujAtleticara("Neko Nekic");
        sprint.stampajPobednika();





    }
}
