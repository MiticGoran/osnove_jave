package JavaTestPrimer1Klase;

public class Planina {
    private String imePlanine;
    private String lokacijaDrzava;
    private int visinaPlanine;

    public Planina(){
    }

    public Planina(String imePlanine, String lokacijaDrzava, int visinaPlanine) {
        this.imePlanine = imePlanine;
        this.lokacijaDrzava = lokacijaDrzava;
        this.visinaPlanine = visinaPlanine;
    }

    public String getImePlanine() {
        return imePlanine;
    }

    public void setImePlanine(String imePlanine) {
        this.imePlanine = imePlanine;
    }

    public String getLokacijaDrzava() {
        return lokacijaDrzava;
    }

    public void setLokacijaDrzava(String lokacijaDrzava) {
        this.lokacijaDrzava = lokacijaDrzava;
    }

    public int getVisinaPlanine() {
        return visinaPlanine;
    }

    public void setVisinaPlanine(int visinaPlanine) {
        this.visinaPlanine = visinaPlanine;
    }
}
