package p12_01_2023;

public class ZoomCall {
    private String linkZaPoziv;
    private String password;
    private Korisnik host;
    private Korisnik guest;

    public ZoomCall(String linkZaPoziv, String password, Korisnik host) {
        this.linkZaPoziv = linkZaPoziv;
        this.password = password;
        this.host = host;
    }
    public ZoomCall(String linkZaPoziv, String password, Korisnik host, Korisnik guest) {
        this.linkZaPoziv = linkZaPoziv;
        this.password = password;
        this.host = host;
        this.guest = guest;
    }

    public void setGuest(Korisnik guest) {
        this.guest = guest;
    }

    public String getLinkZaPoziv() {
        return this.linkZaPoziv;
    }

    public String getPassword() {
        return this.password;
    }

    public Korisnik getHost() {
        return this.host;
    }

    public Korisnik getGuest() {
        return this.guest;
    }
    public void pokreniPoziv(){
        System.out.println("Zoom Call: " + this.linkZaPoziv);
        System.out.println("Password: " + this.password);
        System.out.println("Host: " + this.host.getImeIPrezime());
        System.out.println("Guest: " + this.guest.getImeIPrezime());
        System.out.println("Maksimalno trajanje poziva je " + this.getHost().maksDuzinaTrajanja());
    }
}
