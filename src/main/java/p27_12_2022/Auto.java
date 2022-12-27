package p27_12_2022;

public class Auto {
    public String imeVozaca;
    public String markaAuta;
    public int brojVrata;
    public int potrosnja;
    public int brzina;
    public int godinaProizvodnje;
    public int registracija;
    public int kubikazaAuta;

    public void print(){
        System.out.println(this.imeVozaca);
        System.out.println(this.markaAuta + " - " + this.brojVrata + "-ro vrata");
        System.out.println("Sa potrosnjom od " + this.potrosnja + "l na 100km");
        System.out.println(this.brzina + "km/h je trenutna brzina.");
    }

    public boolean prekoracenjeBrzine(int ogranicenje){
        if (this.brzina > ogranicenje){
            return true;
        } else {
            return false;
        }
    }

    public int kazna(int ogranicenje){
        int x = (this.brzina - ogranicenje);
        if(x > 0) {
            return x * 1000;
        }
        return 0;
    }

    public boolean oldtimer(){
        if(this.godinaProizvodnje > 1950){
            return false;
        } else {
            return true;
        }
    }

    public boolean registracijaAuta(int trenutniMesec){
        if (this.registracija >= trenutniMesec){
            return false;
        } else {
            return true;
        }
    }

    public int cenaRegistracije(){
        int cena;
        if (this.kubikazaAuta < 2000){
            cena = this.kubikazaAuta * 100;
            return cena;
        } else {
            cena = this.kubikazaAuta * 100 * 100 /3;
            return cena;
        }
    }

}
