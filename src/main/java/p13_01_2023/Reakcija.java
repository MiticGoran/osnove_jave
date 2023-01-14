package p13_01_2023;

public class Reakcija {
    private String tipReakcije;
    private String imeIPrezimeKorisnika;

    public String getTipReakcije() {
        return tipReakcije;
    }
    public void setTipReakcije(String tipReakcije) {
        this.tipReakcije = tipReakcije;
    }

    public String getImeIPrezimeKorisnika() {
        return imeIPrezimeKorisnika;
    }

    public void setImeIPrezimeKorisnika(String imeIPrezimeKorisnika) {
        this.imeIPrezimeKorisnika = imeIPrezimeKorisnika;
    }

    public Reakcija(String tipReakcije, String imeIPrezimeKorisnika) {
        this.tipReakcije = tipReakcije;
        this.imeIPrezimeKorisnika = imeIPrezimeKorisnika;
    }
}
