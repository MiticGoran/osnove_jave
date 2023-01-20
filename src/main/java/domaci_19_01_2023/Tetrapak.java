package domaci_19_01_2023;

public class Tetrapak extends Ambalaza {
    private boolean zaReciklazu;
    private double osnovnaCena;

    public void setZaReciklazu(boolean zaReciklazu) {
        this.zaReciklazu = zaReciklazu;
    }

    public boolean isZaReciklazu() {
        return zaReciklazu;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public Tetrapak(String barkod, String naziv, double netoTezina, double brutoTezina,
                    boolean zaReciklazu, double osnovnaCena) {
        super(barkod, naziv, netoTezina, brutoTezina);
        this.zaReciklazu = zaReciklazu;
        this.osnovnaCena = osnovnaCena;
    }
    public Tetrapak(){
    }
    @Override
    public double cenaArtikla() {
        if (this.zaReciklazu){
            return this.tezinaPakovanja() * 1.5 + this.osnovnaCena;
        } else{
            return this.osnovnaCena;
        }
    }
    @Override
    public void stampaj() {
        System.out.println("Barkod: " + this.getBarkod());
        System.out.println("Naziv artikla: " + this.getNaziv());
        System.out.println("Neto tezina: " + this.getNetoTezina());
        System.out.println("Bruto tezina: " + this.getBrutoTezina());
        if(zaReciklazu){
            System.out.println("Moze da se reciiklira.");
        } else {
            System.out.println("Nije za reciklazu.");
        }
        System.out.println("Cena: " + this.cenaArtikla());
    }
}
