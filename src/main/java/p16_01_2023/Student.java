package p16_01_2023;

public class Student extends Osoba {
    private String brojIndeksa;
    private double dugZaSkolarinu;
    public Student(String imeIPrezime, String jmbg, String brojIndeksa, double dugZaSkolarinu) {
        super(imeIPrezime, jmbg);
        this.brojIndeksa = brojIndeksa;
        this.dugZaSkolarinu = dugZaSkolarinu;
    }
    public void uplatiSkolarinu(Double uplaceno){
        this.dugZaSkolarinu = this.dugZaSkolarinu - uplaceno;
    }
    public void stampaj(){
        System.out.println("Student: ");
        super.stampaj();
        System.out.println("Broj indeksa: " + this.brojIndeksa + ", Dug: " + this.dugZaSkolarinu);
    }

}
