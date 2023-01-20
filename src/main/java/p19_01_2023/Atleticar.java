package p19_01_2023;

public abstract class Atleticar {
    private String imeIPrezime;
    protected double ostvarenRezultat;

    public Atleticar(){
    }
    public Atleticar(String ime, double ostvarenRezultat) {
        this.imeIPrezime = ime;
        this.ostvarenRezultat = ostvarenRezultat;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public double getOstvarenRezultat() {
        return ostvarenRezultat;
    }

    public void setOstvarenRezultat(int ostvarenRezultat) {
        this.ostvarenRezultat = ostvarenRezultat;
    }


    public abstract boolean koJeBolji(Atleticar atleticar);
    public void stampaj(){
        System.out.println(this.imeIPrezime +  ", " + this.ostvarenRezultat);
    }
}
