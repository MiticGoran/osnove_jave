package p19_01_2023;

public class Skakac extends Atleticar{

    public Skakac(){
    }
    public Skakac(String ime, double ostvarenRezultat) {
        super(ime, ostvarenRezultat);
    }
    @Override
    public boolean koJeBolji(Atleticar atleticar) {
        if (this.ostvarenRezultat > atleticar.ostvarenRezultat){
            return true;
        } else{
            return false;
        }
    }
}
