package p19_01_2023;

public class Zgrada extends Objekat {
    private int brojStanova;

    public Zgrada(){
    }

    public Zgrada(String adresa, double povrsinaObjekta, int zona, int brojStanova) {
        super(adresa, povrsinaObjekta, zona);
        this.brojStanova = brojStanova;
    }

    public int getBrojStanova() {
        return brojStanova;
    }

    public void setBrojStanova(int brojStanova) {
        this.brojStanova = brojStanova;
    }

    @Override
    public double racunajPorez() {
        return this.koeficijentPoreza() * this.povrsinaObjekta * this.brojStanova;
    }
    @Override
    public void stampaj() {
        System.out.println("Zgrada: ");
        System.out.println("Adresa: " + this.adresa);
        System.out.println("Povrsina zgrade: " + this.povrsinaObjekta);
        System.out.println("Zona: " + this.zona);
        System.out.println("Broj stanova: " + this.brojStanova);
        System.out.println("Porez: " + this.racunajPorez());
    }
}
