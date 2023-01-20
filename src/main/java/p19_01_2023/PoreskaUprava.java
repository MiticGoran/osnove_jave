package p19_01_2023;

import java.util.ArrayList;

public class PoreskaUprava {
    private String imeGrada;
    public PoreskaUprava(String imeGrada) {
        this.imeGrada = imeGrada;
        this.niz = new ArrayList<>();
    }

    ArrayList<Objekat> niz = new ArrayList<Objekat>();
    public void dodajObjekat(Objekat o){
        niz.add(o);
    }
    public double ObjekatSaNajvecimPorezom(){
        double najveciPorez = 0;
        for (int i = 0; i < niz.size(); i++) {
            if (niz.get(i).racunajPorez() > najveciPorez){
                najveciPorez = niz.get(i).racunajPorez();
            }
        }
        return najveciPorez;
    }
    public double ObjekatSaNajmanjimPorezom(){
        double najmanjiPorez = 99999999;
        for (int i = 0; i < niz.size(); i++) {
            if (niz.get(i).racunajPorez() < najmanjiPorez){
                najmanjiPorez = niz.get(i).racunajPorez();
            }
        }
        return najmanjiPorez;
    }
    public double ukupanPorezZaGrad(String imeGrada){
        double ukupanPorez = 0;
        if (this.imeGrada.equals(imeGrada)){
            for (int i = 0; i < niz.size(); i++) {
                ukupanPorez = ukupanPorez + niz.get(i).racunajPorez();
            }
        }
        return ukupanPorez;
    }
    public void stampajSveObjekte(){
        for (int i = 0; i < niz.size(); i++) {
            niz.get(i).stampaj();
        }
    }

}
