package JavaTestPrimer1Klase;

import java.util.ArrayList;

public class PlaninarskiDom {
    private String nazivDoma;
    private int godinaOsnivanja;
    private ArrayList<Planinar> nizPlaninari;

    public PlaninarskiDom(){
    }

    public PlaninarskiDom(String nazivDoma, int godinaOsnivanja) {
        this.nazivDoma = nazivDoma;
        this.godinaOsnivanja = godinaOsnivanja;
        this.nizPlaninari = new ArrayList<Planinar>();
    }
    public void dodajPlaninara(Planinar planinar){
        this.nizPlaninari.add(planinar);
    }
    public int brojUspesnoPopetih(Planina p){
        int brojac = 0;
        for (int i = 0; i < nizPlaninari.size(); i++) {
            if(this.nizPlaninari.get(i).uspesanUspon(p)){
                brojac++;
            }
        }
        return brojac;
    }

    public void izbaciPlaninara(int id){
        for (int i = 0; i < this.nizPlaninari.size(); i++) {
            if (this.nizPlaninari.get(i).getId() == id){
                this.nizPlaninari.remove(i);
            }
        }
    }
    public void stampaj(){
        System.out.println("Naziv doma: " + this.nazivDoma);
        System.out.println("Godina osnivanja: " + this.godinaOsnivanja);
        for (int i = 0; i < this.nizPlaninari.size(); i++) {
            this.nizPlaninari.get(i).stampaj();
//            System.out.println("Planinar, ID: " + this.nizPlaninari.get(i).getId());
//            System.out.println("Ime: " + this.nizPlaninari.get(i).getImeIPrezime());
        }
    }
    public double mesecniPrihod(){
        double suma = 0;
        for (int i = 0; i < this.nizPlaninari.size(); i++) {
            suma = suma + this.nizPlaninari.get(i).clanarina();
        }
        return suma;
    }
}
