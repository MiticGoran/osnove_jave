package JavaTestPrimer1Klase;

public abstract class Planinar {
    protected int id;
    protected String imeIPrezime;

    public Planinar(int id, String imeIPrezime) {
        this.id = id;
        this.imeIPrezime = imeIPrezime;
    }

    public int getId() {
        return id;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public abstract void stampaj();
    public abstract double clanarina();
    public abstract boolean uspesanUspon(Planina p);
}
