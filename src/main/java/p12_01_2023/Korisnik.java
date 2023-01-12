package p12_01_2023;

public class Korisnik {
    private String imeIPrezime;
    private String tipLicence;

    public Korisnik(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
        this.tipLicence = "basic";
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getTipLicence() {
        return this.tipLicence;
    }

    public void pretplatiSe(int uplata){
        if (uplata == 100){
            this.tipLicence = "pro";
        } else if (uplata == 150) {
            this.tipLicence = "premium";
        }
    }
    public void ponistiPretplatu(){
        this.tipLicence = "basic";
    }
    public String maksDuzinaTrajanja(){
        if (this.tipLicence.equals("basic")){
            return "40min";
        } else if (this.tipLicence.equals("pro")) {
            return "240min";
        } else if (this.tipLicence.equals("premium")) {
            return "1440min";
        } return "0";
    }


}
