package p16_01_2023;

public class MasterKartica extends PlatnaKartica {

    public MasterKartica(double suma, String brojKartice, String godinaDoKadVaziKartica,
                         String mesecDoKadVaziKartica) {
        super(suma, brojKartice, godinaDoKadVaziKartica, mesecDoKadVaziKartica);
    }
    public void izvrsiTransakciju(double vrednost){
        super.izvrsiTransakciju(vrednost);
        double provizija = vrednost * (1.5 / 100);
        this.suma = this.suma - provizija;
    }
    public void naplatiOdrzavanje(){
        this.suma = this.suma - 2;
    }
    public void stampaj(){
        System.out.print("Master Card: ");
        super.stampaj();
    }
}
