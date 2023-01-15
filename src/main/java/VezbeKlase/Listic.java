package VezbeKlase;

import java.util.ArrayList;

public class Listic {
    private ArrayList<Kombinacija> kombinacije;

    public ArrayList<Kombinacija> getKombinacije() {
        return kombinacije;
    }

    public Listic() {
        this.kombinacije = new ArrayList<>();
    }

    public void dodajKombinaciju(Kombinacija kombinacija) {
        this.kombinacije.add(kombinacija);
    }

    public boolean izvucenaSedmica(Kombinacija izvucena) {
        for (int i = 0; i < this.kombinacije.size(); i++) {
            if (this.kombinacije.get(i).getBrojevi().equals(izvucena.getBrojevi())){
                return true;
            }
        }
        return false;
    }
}
