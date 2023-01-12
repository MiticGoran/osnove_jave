package p12_01_2023;

public class ViberPoruka {
    private String tekstPoruke;
    private String vremePoruke;
    private ViberKorisnik korisnikPoslaoPoruku;
    private ViberKorisnik korisnikPrimioPoruku;

    public String getTekstPoruke() {
        return tekstPoruke;
    }

    public void setTekstPoruke(String tekstPoruke) {
        this.tekstPoruke = tekstPoruke;
    }

    public String getVremePoruke() {
        return vremePoruke;
    }

    public void setVremePoruke(String vremePoruke) {
        this.vremePoruke = vremePoruke;
    }

    public ViberKorisnik getKorisnikPoslaoPoruku() {
        return korisnikPoslaoPoruku;
    }

    public void setKorisnikPoslaoPoruku(ViberKorisnik korisnikPoslaoPoruku) {
        this.korisnikPoslaoPoruku = korisnikPoslaoPoruku;
    }

    public ViberKorisnik getKorisnikPrimioPoruku() {
        return korisnikPrimioPoruku;
    }

    public void setKorisnikPrimioPoruku(ViberKorisnik korisnikPrimioPoruku) {
        this.korisnikPrimioPoruku = korisnikPrimioPoruku;
    }

    public ViberPoruka(String tekstPoruke, String vremePoruke,
                       ViberKorisnik korisnikPoslaoPoruku, ViberKorisnik korisnikPrimioPoruku) {
        this.tekstPoruke = tekstPoruke;
        this.vremePoruke = vremePoruke;
        this.korisnikPoslaoPoruku = korisnikPoslaoPoruku;
        this.korisnikPrimioPoruku = korisnikPrimioPoruku;
    }

    public void stampajViber(){
        System.out.println("From: " + this.korisnikPoslaoPoruku.getImeIPrezime() + this.korisnikPoslaoPoruku.getAktivan()
        + " at " + this.vremePoruke);
        System.out.println("To: " + this.korisnikPrimioPoruku.getImeIPrezime());
        System.out.println("Tekst poruke: " + this.tekstPoruke);
    }
}
