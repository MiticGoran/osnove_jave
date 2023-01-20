package domaci_19_01_2023;

public class SuperKartica {
    private String brojKartice;
    private String imeVlasnika;
    private double popust;

    public SuperKartica(String brojKartice, String imeVlasnika, double popust) {
        this.brojKartice = brojKartice;
        this.imeVlasnika = imeVlasnika;
        this.popust = popust;
    }
    public SuperKartica(){
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(String brojKartice) {
        this.brojKartice = brojKartice;
    }

    public String getImeVlasnika() {
        return imeVlasnika;
    }

    public void setImeVlasnika(String imeVlasnika) {
        this.imeVlasnika = imeVlasnika;
    }

    public double getPopust() {
        return popust;
    }

    public void setPopust(double popust) {
        this.popust = popust;
    }

    public void stampaj(){
        System.out.println(this.brojKartice + ", " + this.imeVlasnika);
    }
}
