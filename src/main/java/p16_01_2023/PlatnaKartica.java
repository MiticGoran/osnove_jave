package p16_01_2023;

public class PlatnaKartica {
    protected double suma;
    protected String brojKartice;
    protected String godinaDoKadVaziKartica;
    protected String mesecDoKadVaziKartica;

    public PlatnaKartica(double suma, String brojKartice, String godinaDoKadVaziKartica, String mesecDoKadVaziKartica) {
        this.suma = suma;
        this.brojKartice = brojKartice;
        this.godinaDoKadVaziKartica = godinaDoKadVaziKartica;
        this.mesecDoKadVaziKartica = mesecDoKadVaziKartica;
    }

    public double getSuma() {
        return suma;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public String getGodinaDoKadVaziKartica() {
        return godinaDoKadVaziKartica;
    }

    public String getMesecDoKadVaziKartica() {
        return mesecDoKadVaziKartica;
    }
    public void dodajSredstva(double vrednost){
        this.suma = this.suma + vrednost;
    }
    public void izvrsiTransakciju(double vrednost){
        this.suma = this.suma - vrednost;
    }
    public void stampaj(){
        System.out.println(this.brojKartice + ", " + this.mesecDoKadVaziKartica + "/" + this.godinaDoKadVaziKartica
        + ", $" + this.suma);
    }
}
