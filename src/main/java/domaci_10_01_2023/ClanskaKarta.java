package domaci_10_01_2023;

public class ClanskaKarta {
    private String brojKartice;
    private int popust;

    public String getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(String brojKartice) {
        this.brojKartice = brojKartice;
    }

    public int getPopust() {
        return popust;
    }

    public void setPopust(int popust) {
        this.popust = popust;
    }

    public ClanskaKarta(String brojKartice, int popust) {
        this.brojKartice = brojKartice;
        this.popust = popust;
    }
}
