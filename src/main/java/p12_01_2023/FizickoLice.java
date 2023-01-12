package p12_01_2023;

public class FizickoLice {
    private String imeIPrezime;
    private String brojLicneKarte;
    private String jmbg;
    private boolean vecKupovalaNekretninu;

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getBrojLicneKarte() {
        return brojLicneKarte;
    }

    public void setBrojLicneKarte(String brojLicneKarte) {
        this.brojLicneKarte = brojLicneKarte;
    }

    public String getJmbg() {
        return jmbg;
    }

    public boolean isVecKupovalaNekretninu() {
        return vecKupovalaNekretninu;
    }

    public void setVecKupovalaNekretninu(boolean vecKupovalaNekretninu) {
        this.vecKupovalaNekretninu = vecKupovalaNekretninu;
    }

    public FizickoLice(String imeIPrezime, String brojLicneKarte, String jmbg, boolean vecKupovalaNekretninu) {
        this.imeIPrezime = imeIPrezime;
        this.brojLicneKarte = brojLicneKarte;
        this.vecKupovalaNekretninu = vecKupovalaNekretninu;
    }

    public void stampaj(){
        System.out.println("Ime i prezime: " + this.imeIPrezime + ", Broj licne karte: " + this.brojLicneKarte);
    }

}
