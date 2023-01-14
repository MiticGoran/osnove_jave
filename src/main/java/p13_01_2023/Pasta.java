package p13_01_2023;

import java.util.ArrayList;

public class Pasta {
    private ArrayList<Sastojak> sastojci;

    public ArrayList<Sastojak> getSastojci() {
        return sastojci;
    }

    public void setSastojci(ArrayList<Sastojak> sastojci) {
        this.sastojci = sastojci;
    }

    public void dodajSastojak(Sastojak sastojak){
        sastojci.add(sastojak);
    }

    public Pasta(){
        this.sastojci = new ArrayList<>();
    }

    public double cenaPaste(){
        double suma = 0;
        for (int i = 0; i < sastojci.size(); i++) {
            suma = suma + sastojci.get(i).getCena();
        }
        return suma;
    }
    public void printData(){
        System.out.println("Pasta je sa sastojcima: ");
        for (int i = 0; i < sastojci.size(); i++) {
            System.out.println(sastojci.get(i).getNaziv() + " - " + sastojci.get(i).getCena() + "din.");
        }
        System.out.println("Cena paste je: " + cenaPaste());
    }

    public void obrisiSastojak(String sastojak){
        for (int i = 0; i < sastojci.size(); i++) {
            if (sastojci.get(i).getNaziv().equals(sastojak)){
                sastojci.remove(i);
            }
        }
    }
}
