package p10_01_2023;

public class Radnik {
    private String jmbg;
    private String imeIPrezime;
    private int brojDece;
    private int stepenStrucneSpreme;
    private int godineRadnogStaza;

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public int getBrojDece() {
        return brojDece;
    }

    public void setBrojDece(int brojDece) {
        this.brojDece = brojDece;
    }

    public int getStepenStrucneSpreme() {
        return stepenStrucneSpreme;
    }

    public void setStepenStrucneSpreme(int stepenStrucneSpreme) {
        this.stepenStrucneSpreme = stepenStrucneSpreme;
    }

    public int getGodineRadnogStaza() {
        return godineRadnogStaza;
    }

    public void setGodineRadnogStaza(int godineRadnogStaza) {
        this.godineRadnogStaza = godineRadnogStaza;
    }

    public String getJmbg() {
        return jmbg;
    }

    public Radnik(String jmbg){
        this.jmbg = jmbg;
    }

    public Radnik(String jmbg, String imeIPrezime, int brojDece, int stepenStrucneSpreme, int godineRadnogStaza){
        this.jmbg = jmbg;
        this.imeIPrezime = imeIPrezime;
        this.brojDece = brojDece;
        this.stepenStrucneSpreme = stepenStrucneSpreme;
        this.godineRadnogStaza = godineRadnogStaza;
    }
    public double minuliRad(){
        if (this.godineRadnogStaza < 10){
            return 0.05;
        } else if (this.godineRadnogStaza >= 10 && this.godineRadnogStaza <= 20) {
            return 0.075;
        } else if (this.godineRadnogStaza > 20){
            return 0.1;
        } else return 0;
    }
    public double koeficijentSlozenosti(){
        double slozenostKoef = 0;
        slozenostKoef = this.stepenStrucneSpreme * this.brojDece;
        return slozenostKoef;
    }
    public double plataRadnika(){
        double plata = 0;
        plata = 25000 + (koeficijentSlozenosti() + minuliRad()*10000);
        return plata;
    }

    public boolean kreditnoSposoban(){
        return plataRadnika() > 50000;
    }

    public void stampaj(){
        System.out.println();
    }

}
