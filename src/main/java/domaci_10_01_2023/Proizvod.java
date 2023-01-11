package domaci_10_01_2023;

public class Proizvod {
    private String nazivProizvoda;
    private Kupac kupac;
    private int cenaIzrade;

    public String getNazivProizvoda() {
        return nazivProizvoda;
    }

    public void setNazivProizvoda(String nazivProizvoda) {
        this.nazivProizvoda = nazivProizvoda;
    }

    public Kupac getKupac() {
        return kupac;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }

    public int getCenaIzrade() {
        return cenaIzrade;
    }

    public void setCenaIzrade(int cenaIzrade) {
        this.cenaIzrade = cenaIzrade;
    }

    public Proizvod(String nazivProizvoda, Kupac kupac, int cenaIzrade) {
        this.nazivProizvoda = nazivProizvoda;
        this.kupac = kupac;
        this.cenaIzrade = cenaIzrade;
    }
    public double racunajCenuProizvoda(){
        double cenaProizvoda = this.cenaIzrade * 1.9 * (100 - 10)/100;
        return cenaProizvoda;
    }
    public void stampajProizvod(){
        System.out.println(this.nazivProizvoda + " - " + racunajCenuProizvoda());
        System.out.println(this.kupac.getImeIPrezime() + " - " + this.kupac.getClanskaKarta().getBrojKartice());
    }
}
