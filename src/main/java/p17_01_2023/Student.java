package p17_01_2023;

public abstract class Student {
    protected String imeIPrezime;
    protected int brojIndeksa;
    protected int godinaStudija;

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public int getGodinaStudija() {
        return godinaStudija;
    }

    public void setGodinaStudija(int godinaStudija) {
        this.godinaStudija = godinaStudija;
    }

    public Student(String imeIPrezime, int brojIndeksa, int godinaStudija) {
        this.imeIPrezime = imeIPrezime;
        this.brojIndeksa = brojIndeksa;
        this.godinaStudija = godinaStudija;
    }
    public abstract double cenaSkolarine();
    public abstract boolean daLiJeNaBudzetu();
    public void stampaj(){
        System.out.println(this.imeIPrezime + ", Broj indeksa: " + this.brojIndeksa + ", Godina studija: " + this.godinaStudija);
        if (this.daLiJeNaBudzetu()){
            System.out.println("Finansiranje: Budzet");
        }else {
            System.out.println("Finansiranje: Samofinansiranje");
        }
        System.out.println("Cena skolarine: " + this.cenaSkolarine());
    }
}
