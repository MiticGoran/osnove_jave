package p17_01_2023;

public class VisaKartica extends PlatnaKartica {
    private String ovlascenoLice;
    public String getOvlascenoLice() {
        return ovlascenoLice;
    }
    public void setOvlascenoLice(String ovlascenoLice) {
        this.ovlascenoLice = ovlascenoLice;
    }
    public VisaKartica(double suma, String brojKartice, String godinaDoKadVaziKartica,
                       String mesecDoKadVaziKartica, String ovlascenoLice) {
        super(suma, brojKartice, godinaDoKadVaziKartica, mesecDoKadVaziKartica);
        this.ovlascenoLice = ovlascenoLice;
    }
    @Override
    public void izvrsiTransakciju(double vrednost){
        double provizija = vrednost * (1.8 / 100);
        if (provizija < 4){
            provizija = 4;
        }
        this.suma = this.suma - provizija;
    }
    @Override
    public void stampaj(){
        System.out.print("Visa Card: ");
        System.out.println(this.brojKartice + ", " + this.mesecDoKadVaziKartica + "/" + this.godinaDoKadVaziKartica
                + ", $" + this.suma);
        System.out.println("Ovlasceno lice: " + this.ovlascenoLice);
    }
}
