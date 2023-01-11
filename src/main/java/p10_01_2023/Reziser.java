package p10_01_2023;

public class Reziser {
    private String imeRezisera;
    private int starostRezisera;
    private Film reziraoJe;

    public Reziser(String imeRezisera, int starostRezisera) {
        this.imeRezisera = imeRezisera;
        this.starostRezisera = starostRezisera;
    }

    public void setReziraoJe(Film reziraoJe) {
        this.reziraoJe = reziraoJe;
    }

    public String getImeRezisera() {
        return imeRezisera;
    }

    public void setImeRezisera(String imeRezisera) {
        this.imeRezisera = imeRezisera;
    }

    public int getStarostRezisera() {
        return starostRezisera;
    }

    public void setStarostRezisera(int starostRezisera) {
        this.starostRezisera = starostRezisera;
    }
    public void stampajRezisera(){
        System.out.println(this.imeRezisera + ", " + this.starostRezisera);
    }

}
