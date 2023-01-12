package p12_01_2023;

public class ViberKorisnik {
    private String imeIPrezime;
    private String brojTelefona;
    private boolean aktivan;

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getBrojTelefona() {
        return brojTelefona;
    }

    public void setBrojTelefona(String brojTelefona) {
        this.brojTelefona = brojTelefona;
    }

    public boolean getAktivan() {
        return aktivan;
    }

    public void setAktivan(boolean aktivan) {
        this.aktivan = aktivan;
    }

    public ViberKorisnik(String imeIPrezime, String brojTelefona, boolean aktivan) {
        this.imeIPrezime = imeIPrezime;
        this.brojTelefona = brojTelefona;
        this.aktivan = aktivan;
    }

}
