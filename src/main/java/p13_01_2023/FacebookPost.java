package p13_01_2023;

import java.util.ArrayList;

public class FacebookPost {
    private String imeIPrezimeKorisnikaOglas;
    private String tekstObjave;
    private ArrayList<Reakcija> reakcije;

    public String getImeIPrezimeKorisnikaOglas() {
        return imeIPrezimeKorisnikaOglas;
    }

    public FacebookPost(){
        this.reakcije = new ArrayList<>();
    }
    public FacebookPost(String imeIPrezimeKorisnikaOglas, String tekstObjave) {
        this.imeIPrezimeKorisnikaOglas = imeIPrezimeKorisnikaOglas;
        this.tekstObjave = tekstObjave;
        this.reakcije = new ArrayList<>();
    }
    public void setImeIPrezimeKorisnikaOglas(String imeIPrezimeKorisnikaOglas) {
        this.imeIPrezimeKorisnikaOglas = imeIPrezimeKorisnikaOglas;
    }

    public String getTekstObjave() {
        return tekstObjave;
    }

    public void setTekstObjave(String tekstObjave) {
        this.tekstObjave = tekstObjave;
    }

    public ArrayList<Reakcija> getReakcije() {
        return reakcije;
    }

    public void setReakcije(ArrayList<Reakcija> reakcije) {
        this.reakcije = reakcije;
    }

    public void reaguj(Reakcija reakcija){
        for (int i = 0; i < this.reakcije.size() ; i++) {
            if (this.reakcije.get(i).getImeIPrezimeKorisnika().equals(reakcija.getImeIPrezimeKorisnika())){
                this.reakcije.remove(i);
            }
        }
        this.reakcije.add(reakcija);
    }
    private int brojReakcija(String reakcija){
        int counter = 0;
        for (int i = 0; i < this.reakcije.size(); i++) {
            if (this.reakcije.get(i).getTipReakcije().equals(reakcija)){
                counter++;
            }
        }
        return counter;
    }
    public void stampaj(){
        System.out.println(this.imeIPrezimeKorisnikaOglas);
        System.out.println(this.tekstObjave);
        System.out.println("Smiley " + this.brojReakcija("smiley") + " | Like " + this.brojReakcija("like")
                + " | Heart " + this.brojReakcija("heart") + " | Cry " + this.brojReakcija("Cry"));

    }
}
