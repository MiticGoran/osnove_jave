package p19_01_2023;

public class Kuca extends Objekat{
    private int brojClanova;
    public Kuca(){
    }
    public Kuca(String adresa, double povrsinaObjekta, int zona, int brojClanova) {
        super(adresa, povrsinaObjekta, zona);
        this.brojClanova = brojClanova;
    }

    public int getBrojClanova() {
        return brojClanova;
    }

    public void setBrojClanova(int brojClanova) {
        this.brojClanova = brojClanova;
    }

    @Override
    public double racunajPorez() {
        return this.koeficijentPoreza() * this.povrsinaObjekta;
    }

    @Override
    public void stampaj() {
        System.out.println("Kuca: ");
        System.out.println("Adresa: " + this.adresa);
        System.out.println("Povrsina kuce: " + this.povrsinaObjekta);
        System.out.println("Zona: " + this.zona);
        System.out.println("Broj clanova: " + this.brojClanova);
        System.out.println("Porez: " + this.racunajPorez());
    }
}
