package p16_01_2023;

public class Profesor extends Osoba{
    private String predmetKojiPredaje;
    private double iznosPlate;
    public Profesor(String imeIPrezime, String jmbg, String predmetKojiPredaje, double iznosPlate){
        super(imeIPrezime, jmbg);
        this.predmetKojiPredaje = predmetKojiPredaje;
        this.iznosPlate = iznosPlate;
    }
    public void povecajPlatu(double povecanje){
        this.iznosPlate = this.iznosPlate + (this.iznosPlate * povecanje / 100);
    }
    public void stampaj(){
        System.out.println("Profesor: ");
        super.stampaj();
        System.out.println("Predmet: " + this.predmetKojiPredaje + " Plata: " + this.iznosPlate);
    }
}
