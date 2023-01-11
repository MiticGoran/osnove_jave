package domaci_10_01_2023;

public class Kupac {
    private String imeIPrezime;
    private ClanskaKarta clanskaKarta;

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public ClanskaKarta getClanskaKarta() {
        return clanskaKarta;
    }

    public Kupac(String imeIPrezime, ClanskaKarta clanskaKarta) {
        this.imeIPrezime = imeIPrezime;
        this.clanskaKarta = clanskaKarta;
    }

    public void stampajKupca(){
        System.out.println(this.imeIPrezime + " - " + this.clanskaKarta.getBrojKartice());
    }
}
