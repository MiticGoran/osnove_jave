package domaci_29_12_2022;

public class FacebookPost {
    private String imeKorisnikaKojiJeObjavio;
    private String imeKorisnikaGdeJeObjavljen;
    private String objava;
    private int brojLajkova;
    private int brojDeljenja;

    public void setImeKorisnikaKojiJeObjavio(String imeKorisnikaKojiJeObjavio) {
        this.imeKorisnikaKojiJeObjavio = imeKorisnikaKojiJeObjavio;
    }

    public void setImeKorisnikaGdeJeObjavljen(String imeKorisnikaGdeJeObjavljen) {
        this.imeKorisnikaGdeJeObjavljen = imeKorisnikaGdeJeObjavljen;
    }

    public void setObjava(String objava) {
        this.objava = objava;
    }

    public String getImeKorisnikaKojiJeObjavio() {
        return imeKorisnikaKojiJeObjavio;
    }

    public String getImeKorisnikaGdeJeObjavljen() {
        return imeKorisnikaGdeJeObjavljen;
    }

    public String getObjava() {
        return objava;
    }

    public int getBrojLajkova() {
        return brojLajkova;
    }

    public int getBrojDeljenja() {
        return brojDeljenja;
    }

    public void like(){
        this.brojLajkova = this.brojLajkova + 1;
    }

    public void dislike(){
        this.brojLajkova = this.brojLajkova - 1;
        if (this.brojLajkova < 0){
            this.brojLajkova = 0;
        }
    }

    public void share(){
        this.brojDeljenja = this.brojDeljenja + 1;
    }

    public void print(){
        System.out.println(this.imeKorisnikaKojiJeObjavio + " >>> " + this.imeKorisnikaGdeJeObjavljen);
        System.out.println(this.objava);
        System.out.println("Likes " + this.brojLajkova + " | " + "Shares " + this.brojDeljenja);
    }

}
