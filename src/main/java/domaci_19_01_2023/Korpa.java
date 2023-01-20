package domaci_19_01_2023;

import java.util.ArrayList;

public class Korpa {
    private ArrayList<Ambalaza> nizAmbalaze;

    public Korpa(){
        this.nizAmbalaze = new ArrayList<>();
    }
    public void dodajAmbalazu(Ambalaza a){
        this.nizAmbalaze.add(a);
    }
    public void izbaciAmbalazu(String barkod){
        for (int i = 0; i < this.nizAmbalaze.size(); i++) {
            if (this.nizAmbalaze.get(i).getBarkod().equals(barkod)){
                this.nizAmbalaze.remove(i);
            }
        }
    }
    private double cenaAmbalazaSaPopustom(double popust){
        double suma = 0;
        for (int i = 0; i < this.nizAmbalaze.size(); i++) {
            suma = suma + this.nizAmbalaze.get(i).cenaArtikla();
        }
        return suma - popust;
    }
    public double ukupnaCenaKorpe(SuperKartica kartica){
        double cenaKorpe = 0;
        for (int i = 0; i < this.nizAmbalaze.size(); i++) {
            cenaKorpe = cenaKorpe + this.nizAmbalaze.get(i).cenaArtikla();
        }
        return cenaKorpe - kartica.getPopust();
    }
}
