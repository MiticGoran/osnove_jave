package p19_01_2023;

public class Lokal extends Objekat {
    public Lokal(){
    }
    public Lokal(String adresa, double povrsinaObjekta, int zona) {
        super(adresa, povrsinaObjekta, zona);
    }
    @Override
    public double racunajPorez() {
        return this.koeficijentPoreza() * this.povrsinaObjekta * 1.3;
    }

    @Override
    public void stampaj() {
        System.out.println("Lokal: ");
        System.out.println("Adresa: " + this.adresa);
        System.out.println("Povrsina lokala: " + this.povrsinaObjekta);
        System.out.println("Zona: " + this.zona);
        System.out.println("Porez: " + this.racunajPorez());
    }
}
