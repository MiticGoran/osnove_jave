package p12_01_2023;

public class Sastojak {
    private String nazivSastojka;
    private int cenaSastojka;

    public String getNazivSastojka() {
        return nazivSastojka;
    }

    public void setNazivSastojka(String nazivSastojka) {
        this.nazivSastojka = nazivSastojka;
    }

    public int getCenaSastojka() {
        return cenaSastojka;
    }

    public void setCenaSastojka(int cenaSastojka) {
        this.cenaSastojka = cenaSastojka;
    }

    public Sastojak(String nazivSastojka, int cenaSastojka) {
        this.nazivSastojka = nazivSastojka;
        this.cenaSastojka = cenaSastojka;
    }
}
