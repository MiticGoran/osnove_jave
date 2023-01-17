package p17_01_2023;

public abstract class PlatnaKartica {
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
    public abstract void izvrsiTransakciju(double vrednost);
    public abstract void stampaj();
}
