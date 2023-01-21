package JavaTestPrimer1Klase;

public class Alpinista extends Planinar {
    private int poeni;

    public int getPoeni() {
        return poeni;
    }

    public void setPoeni(int poeni) {
        this.poeni = poeni;
    }

    public Alpinista(int id, String imeIPrezime, int poeni) {
        super(id, imeIPrezime);
        this.poeni = poeni;
    }

    @Override
    public void stampaj() {
        System.out.println("Alpinista, ID: " + this.id);
        System.out.println("Ime: " + this.imeIPrezime);
        System.out.println("Broj poena: " + this.poeni);
    }

    @Override
    public double clanarina() {
        return 1500 - this.poeni * 50;
    }

    @Override
    public boolean uspesanUspon(Planina p) {
        if (4000 > p.getVisinaPlanine()){
            return true;
        } else {
            return false;
        }
    }
}
