package p10_01_2023;

public class Film {
    private String nazivFilma;
    private int godinaFilma;
    private Reziser filmJeRezirao;

    public Film(String nazivFilma, int godinaFilma) {
        this.nazivFilma = nazivFilma;
        this.godinaFilma = godinaFilma;
    }

    public void setFilmJeRezirao(Reziser filmJeRezirao) {
        this.filmJeRezirao = filmJeRezirao;
    }

    public String getNazivFilma() {
        return nazivFilma;
    }

    public void setNazivFilma(String nazivFilma) {
        this.nazivFilma = nazivFilma;
    }

    public int getGodinaFilma() {
        return godinaFilma;
    }

    public void setGodinaFilma(int godinaFilma) {
        this.godinaFilma = godinaFilma;
    }

    public void stampaj(){
        System.out.println("Rezirao ga: " + this.nazivFilma + ", " + this.godinaFilma);
    }

}
