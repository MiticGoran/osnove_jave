package domaci_16_01_2023;

public class Igrac extends Osoba{
    private String brojIgraca;
    private String pozicija;
    private boolean kapiten;
    public Igrac(){

    }
    public Igrac(String imeIPrezime, String jmbg, int godinaRodjenja, String brojIgraca, String pozicija, boolean kapiten) {
        super(imeIPrezime, jmbg, godinaRodjenja);
        this.brojIgraca = brojIgraca;
        this.pozicija = pozicija;
        this.kapiten = kapiten;
    }

    public String getBrojIgraca() {
        return brojIgraca;
    }

    public void setBrojIgraca(String brojIgraca) {
        this.brojIgraca = brojIgraca;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isKapiten() {
        return kapiten;
    }

    public void setKapiten(boolean kapiten) {
        this.kapiten = kapiten;
    }
    @Override
    public void stampaj(){
        System.out.println("Igrac: ");
        super.stampaj();
        System.out.println("Broj na dresu: " + this.brojIgraca + ", Pozicija: "
                + this.pozicija + ", Kapiten: " + this.kapiten);
    }
}
