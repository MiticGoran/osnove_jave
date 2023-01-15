package VezbeKlase;

import java.util.ArrayList;

public class Kombinacija {
    private String idKombinacije;
    private ArrayList<Integer> brojevi;
    public Kombinacija(String idKombinacije, int broj1, int broj2, int broj3, int broj4, int broj5, int broj6, int broj7) {
        this.idKombinacije = idKombinacije;
        this.brojevi = new ArrayList<>();
        this.brojevi.add(broj1);
        this.brojevi.add(broj2);
        this.brojevi.add(broj3);
        this.brojevi.add(broj4);
        this.brojevi.add(broj5);
        this.brojevi.add(broj6);
        this.brojevi.add(broj7);
    }
    public String getIdKombinacije() {
        return idKombinacije;
    }
    public ArrayList<Integer> getBrojevi() {
        return brojevi;
    }
    public boolean daLiJeIstaKombinacija(Kombinacija k){
        int counter = 0;
        for (int i = 0; i < this.brojevi.size(); i++) {
            if (this.brojevi.get(i) == k.getBrojevi().get(i)){
                counter++;
            }
        }
        return counter == 7;
    }
    public void stampajKombinaciju(){
        System.out.println("ID: " + this.idKombinacije);
        System.out.print("Brojevi: " );
        for (int i = 0; i < this.brojevi.size(); i++) {
            System.out.print(this.brojevi.get(i) + ", ");
        }
        System.out.println();
    }
}
