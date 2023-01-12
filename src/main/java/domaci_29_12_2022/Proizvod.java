package domaci_29_12_2022;

public class Proizvod {
    public String nazivProizvoda;
    public double cenaProizvoda;
    public double tezinaGram;

    public void stampaj(){
        System.out.println("Naziv proizvoda: " + this.nazivProizvoda + ", "
                + "Cena: " + this.cenaProizvoda + ", " + "Tezina u gramima: "+ this.tezinaGram);
    }
    public void povecajCenu(double povecanje){
        this.cenaProizvoda = this.cenaProizvoda + povecanje;
    }

    public double vratiCenuSaPopustom(double popust){
        double cenaSaPopustom = this.cenaProizvoda - popust;
        return cenaSaPopustom;
    }
    public double racunajPostarinu(){
        if (this.tezinaGram <= 100){
            return 200;
        } else if (this.tezinaGram > 100 && this.tezinaGram < 500) {
            return 400;
        } else{
            return 1000;
        }
    }
}
