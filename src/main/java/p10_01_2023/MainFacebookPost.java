package p10_01_2023;

public class MainFacebookPost {
    public static void main(String[] args) {
        Korisnik k = new Korisnik("Goran", "Mitic");
        FacebookPost f = new FacebookPost("Valjda radi ovo ovako.", k);

        k.stampajKorisnika();
        f.stampajPost();
    }
}
