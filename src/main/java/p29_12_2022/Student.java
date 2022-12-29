package p29_12_2022;

// getter i setter

public class Student {
    private String ime;
    private String prezime;
    private int brojIndeksa;
    private boolean budzet;

    public void setIme(String ime){
        this.ime = ime;
    }
    public void setPrezime(String prezime){
        this.prezime = prezime;
    }
    public void setBrojIndeksa(int brojIndeksa){
        this.brojIndeksa = brojIndeksa;
    }
    public void setBudzet(boolean budzet){
        this.budzet = budzet;
    }
    public String getIme() {
        return this.ime;
    }
    public String getPrezime(){
        return this.prezime;
    }
    public int getBrojIndeksa(){
        return this.brojIndeksa;
    }
    public boolean getBudzet(){
        return this.budzet;
    }
}
