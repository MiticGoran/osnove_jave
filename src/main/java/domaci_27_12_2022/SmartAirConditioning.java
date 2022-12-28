package domaci_27_12_2022;

public class SmartAirConditioning {
    public String marka;
    public int temperatura;
    public String mod;

    public void print(){
        System.out.println("Marka klime: " + this.marka);
        System.out.println("Temperatura: " + this.temperatura);
        System.out.println("Mod: " + this.mod);
    }

    public boolean temperaturaNapolju(int napolju){
        return napolju > this.temperatura;
    }

}
