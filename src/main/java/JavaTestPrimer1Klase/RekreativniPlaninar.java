package JavaTestPrimer1Klase;

public class RekreativniPlaninar extends Planinar {
    private double tezinaOpreme;
    private String nazivOkruga;
    private int maksimalniUspon;

    public RekreativniPlaninar(int id, String imeIPrezime, double tezinaOpreme, String nazivOkruga, int maksimalniUspon) {
        super(id, imeIPrezime);
        this.tezinaOpreme = tezinaOpreme;
        this.nazivOkruga = nazivOkruga;
        this.maksimalniUspon = maksimalniUspon;
    }

    @Override
    public void stampaj() {
        System.out.println("Rekreativac, ID: " + this.id);
        System.out.println("Ime: " + this.imeIPrezime);
        System.out.println("Okrug: " + this.nazivOkruga);
    }

    @Override
    public double clanarina() {
        return 1000;
    }
    @Override
    public boolean uspesanUspon(Planina p) {
        double usporavanje = 0;
        usporavanje = this.tezinaOpreme * 50;
        if ((this.maksimalniUspon - usporavanje) > p.getVisinaPlanine()){
            return true;
        } else {
            return false;
        }
    }
}
