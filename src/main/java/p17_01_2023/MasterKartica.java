package p17_01_2023;

public class MasterKartica extends PlatnaKartica{
    public MasterKartica(double suma, String brojKartice, String godinaDoKadVaziKartica,
                         String mesecDoKadVaziKartica) {
        super(suma, brojKartice, godinaDoKadVaziKartica, mesecDoKadVaziKartica);
    }
    @Override
    public void izvrsiTransakciju(double vrednost){
        double provizija = vrednost * (1.5 / 100);
        this.suma = this.suma - provizija;
    }
    public void naplatiOdrzavanje(){
        this.suma = this.suma - 2;
    }
    @Override
    public void stampaj(){
        System.out.print("Master Card: ");
        System.out.println(this.brojKartice + ", " + this.mesecDoKadVaziKartica + "/" + this.godinaDoKadVaziKartica
                + ", $" + this.suma);
    }
}
