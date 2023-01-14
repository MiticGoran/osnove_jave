package domaci_12_01_2023;

public class Racun {
    private String brojRacuna;
    private String imeIPrezimeOsobe;
    private double stanjeNaRacunu;

    public String getBrojRacuna() {
        return brojRacuna;
    }

    public String getImeIPrezimeOsobe() {
        return imeIPrezimeOsobe;
    }

    public double getStanjeNaRacunu() {
        return stanjeNaRacunu;
    }

    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public void setImeIPrezimeOsobe(String imeIPrezimeOsobe) {
        this.imeIPrezimeOsobe = imeIPrezimeOsobe;
    }

    public Racun(String brojRacuna, String imeIPrezimeOsobe, double stanjeNaRacunu) {
        this.brojRacuna = brojRacuna;
        this.imeIPrezimeOsobe = imeIPrezimeOsobe;
        this.stanjeNaRacunu = stanjeNaRacunu;
    }

    public double menjajStanjeNaRacunu(double prosledjenaVrednost){
        if (prosledjenaVrednost < 0){
            return this.stanjeNaRacunu = 0;
        } else {
            return this.stanjeNaRacunu = prosledjenaVrednost;
        }
    }
    public void stampajPodatkeRacun(){
        System.out.println("Ime i prezime: " + this.imeIPrezimeOsobe + " - Broj racuna: " + this.brojRacuna);
        System.out.println("Stanje na racunu je: " + this.stanjeNaRacunu + "rsd.");
    }

}
