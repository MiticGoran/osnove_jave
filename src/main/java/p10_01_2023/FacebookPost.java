package p10_01_2023;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;

public class FacebookPost {
    private String opis;
    private Korisnik infoKorisnika;

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Korisnik getInfoKorisnika() {
        return infoKorisnika;
    }

    public void setInfoKorisnika(Korisnik infoKorisnika) {
        this.infoKorisnika = infoKorisnika;
    }

    public FacebookPost(String opis, Korisnik infoKorisnika) {
        this.opis = opis;
        this.infoKorisnika = infoKorisnika;
    }
    public void stampajPost(){
        System.out.println(infoKorisnika.getIme() + ", " + infoKorisnika.getPrezime());
        System.out.println(opis);
    }


}
