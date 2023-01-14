package domaci_13_01_2023;

import java.util.ArrayList;

public class Student {
    private String brojIndeksa;
    private String imeIPrezime;
    private String tipStudija;
    private ArrayList<Ispit> ispiti;

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    public ArrayList<Ispit> getIspiti() {
        return ispiti;
    }
    public Student (){
        this.ispiti = new ArrayList<>();
    }
    public Student(String brojIndeksa, String imeIPrezime, String tipStudija) {
        this.brojIndeksa = brojIndeksa;
        this.imeIPrezime = imeIPrezime;
        this.tipStudija = tipStudija;
        this.ispiti = new ArrayList<>();
    }

    public void dodajIspit(Ispit ispit){
        this.ispiti.add(ispit);
    }
    public double prosek(){
        double zbir = 0;
        double prosecnaOcena = 0;
        int brojOcena = 0;
        for (int i = 0; i < this.ispiti.size(); i++) {
            if (this.ispiti.get(i).getOcena() > 5) {
                brojOcena++;
                zbir = zbir + this.ispiti.get(i).getOcena();
                prosecnaOcena = zbir / brojOcena;
            }

        }
        return prosecnaOcena;
    }
    public void stampaj(){
        System.out.println("Broj indeksa: " + this.brojIndeksa);
        System.out.println("Ime i prezime: " + this.imeIPrezime);
        System.out.println("Tip studija: " + this.tipStudija);
        System.out.println("Predmeti: ");
        for (int i = 0; i < this.ispiti.size(); i++) {
            System.out.println(this.ispiti.get(i).getPredmet() + " - " + this.ispiti.get(i).getProfesor() +
                    " - " + this.ispiti.get(i).getOcena());
        }
        System.out.println("Prosecna ocena: " + this.prosek());
    }
}
