package p27_12_2022;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Auto {
    public String imeVozaca;
    public String markaAuta;
    public int brojVrata;
    public int potrosnja;
    public int brzina;
    public int godinaProizvodnje;
    public int registracija;
    public int kubikazaAuta;
    public String brojRegistracije;
    public boolean klima;
    public int maksBrzina;
    public int kapacitetRezervoara;
    public int trenutnoGoriva;

    public void print() {
        System.out.println(this.imeVozaca);
        System.out.println(this.markaAuta + " - " + this.brojVrata + "-ro vrata");
        System.out.println("Sa potrosnjom od " + this.potrosnja + "l na 100km");
        System.out.println(this.brzina + "km/h je trenutna brzina.");
    }
    public boolean prekoracenjeBrzine(int ogranicenje) {
        if (this.brzina > ogranicenje) {
            return true;
        } else {
            return false;
        }
    }
    public int kazna(int ogranicenje) {
        int x = (this.brzina - ogranicenje);
        if (x > 0) {
            return x * 1000;
        }
        return 0;
    }
    public boolean oldtimer() {
        if (this.godinaProizvodnje > 1950) {
            return false;
        } else {
            return true;
        }
    }
    public boolean registracijaAuta(int trenutniMesec) {
        if (this.registracija >= trenutniMesec) {
            return false;
        } else {
            return true;
        }
    }
    public int cenaRegistracije() {
        int cena;
        if (this.kubikazaAuta < 2000) {
            cena = this.kubikazaAuta * 100;
            return cena;
        } else {
            cena = this.kubikazaAuta * 100 * 100 / 3;
            return cena;
        }
    }
    public void dodajGas() {
        this.brzina = this.brzina + 10;
        if (this.brzina > maksBrzina){
            this.brzina = maksBrzina;
        }
    }
    public void smanjiGas() {
        this.brzina = this.brzina - 10;
        if (this.brzina < 0) {
            this.brzina = 0;
        }
    }
    public double trenutnaPotrosnja() {
        if (this.klima = true) {
            return ((this.brzina / 100.0 * this.potrosnja) * 1.2);
        } else {
            return (this.brzina / 100.0 * this.potrosnja);
        }
    }
    public void stampajTablu(){
        int brzinaProcenti = (this.brzina * 100) / this.maksBrzina;
        for (int i = 0; i < 100 ; i++) {
            if(i <= brzinaProcenti){
                System.out.print("|");
            } else {
                System.out.print("-");
            }
        }
        System.out.println(this.brzina + "/" + this.maksBrzina +"Km/h");
    }
    public int natociGorivo(int litraza){
        int cena = 0;
        int razlika = this.kapacitetRezervoara - this.trenutnoGoriva;
        if (razlika >= litraza){
            this.trenutnoGoriva = litraza;
            cena = litraza *210;
        } else {
            this.trenutnoGoriva = this.kapacitetRezervoara;
            cena = razlika * 120;
        }
        return cena;
    }

}






