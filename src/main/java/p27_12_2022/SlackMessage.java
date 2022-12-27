package p27_12_2022;

public class SlackMessage {
    public String tekstPoruke;
    public String imeIPrezime;
    public String datum;

    public void stampaj(){
        System.out.println(this.imeIPrezime + " - " + this.datum);
        System.out.println(this.tekstPoruke);
    }
}
