package domaci_27_12_2022;

public class Proizvod {
    public String naziv;
    public double cena;
    public double tezinaGram;

    public void stampaj(){
        System.out.println("Proizvod: {{"+this.naziv + "}}"+", "+
                "Cena: {{"+this.cena + "}}"+", "+"Tezina: {{"+this.tezinaGram+"}}");
    }
    public double konvertuj(String konverzija){
        if(konverzija.equals("kg")){
            return this.tezinaGram / 1000;
        } else if (konverzija.equals("t")) {
            return this.tezinaGram / 1000000;
        } else {
            return 0;
        }
    }

}
