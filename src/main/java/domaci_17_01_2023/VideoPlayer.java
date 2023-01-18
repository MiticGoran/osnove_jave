package domaci_17_01_2023;

public class VideoPlayer {
    private double duzinaVidea;
    private double trenutnoVremeVidea;
    private int jacinaZvuka;
    private String kvalitetVidea;
    public VideoPlayer(){
    }
    public VideoPlayer(double duzinaVidea, double trenutnoVremeVidea, int jacinaZvuka, String kvalitetVidea) {
        this.duzinaVidea = duzinaVidea;
        this.trenutnoVremeVidea = trenutnoVremeVidea;
        this.jacinaZvuka = jacinaZvuka;
        this.kvalitetVidea = kvalitetVidea;
    }

    public double getDuzinaVidea() {
        return duzinaVidea;
    }

    public void setDuzinaVidea(double duzinaVidea) {
        this.duzinaVidea = duzinaVidea;
    }

    public double getTrenutnoVremeVidea() {
        return trenutnoVremeVidea;
    }

    public void setTrenutnoVremeVidea(double trenutnoVremeVidea) {
        this.trenutnoVremeVidea = trenutnoVremeVidea;
    }

    public int getJacinaZvuka() {
        return jacinaZvuka;
    }

    public void setJacinaZvuka(int jacinaZvuka) {
        this.jacinaZvuka = jacinaZvuka;
    }

    public String getKvalitetVidea() {
        return kvalitetVidea;
    }

    public void setKvalitetVidea(String kvalitetVidea) {
        this.kvalitetVidea = kvalitetVidea;
    }
    public void stampaj(){
        System.out.println("Trenutno vreme videa: " + this.trenutnoVremeVidea + " sekundi.");
        System.out.println("Jacina zvuka: " + this.jacinaZvuka);
        System.out.println("Kvalitet videa: " + this.kvalitetVidea + "mb/s");
    }
}
