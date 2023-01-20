package domaci_19_01_2023;

public class StaklenaAmbalaza extends Ambalaza {
    private double kaucija;
    private boolean daLiSePlacaKaucija;
    private double osnovnaCena;

    public void setDaLiSePlacaKaucija(boolean daLiSePlacaKaucija) {
        this.daLiSePlacaKaucija = daLiSePlacaKaucija;
    }

    public double getKaucija() {
        return kaucija;
    }

    public boolean isDaLiSePlacaKaucija() {
        return daLiSePlacaKaucija;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public StaklenaAmbalaza(){
    }
    public StaklenaAmbalaza(String barkod, String naziv, double netoTezina, double brutoTezina,
                            double kaucija, boolean daLiSePlacaKaucija, double osnovnaCena) {
        super(barkod, naziv, netoTezina, brutoTezina);
        this.kaucija = kaucija;
        this.daLiSePlacaKaucija = daLiSePlacaKaucija;
        this.osnovnaCena = osnovnaCena;
    }
    @Override
    public double cenaArtikla() {
        if (this.daLiSePlacaKaucija){
            return this.osnovnaCena * 1.2 + this.kaucija;
        } else{
            return this.osnovnaCena * 1.2;
        }
    }

    @Override
    public void stampaj() {
        System.out.println("Barkod: " + this.getBarkod());
        System.out.println("Naziv artikla: " + this.getNaziv());
        System.out.println("Neto tezina: " + this.getNetoTezina());
        System.out.println("Bruto tezina: " + this.getBrutoTezina());
        System.out.println("Cena kaucije: " + this.kaucija);
        if(this.daLiSePlacaKaucija){
            System.out.println("Placa se kaucija.");
        } else {
            System.out.println("Kaucija se ne placa.");
        }
        System.out.println("Cena: " + this.cenaArtikla());
    }

}
