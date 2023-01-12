package p12_01_2023;

public class Ugovor {
    private String datumSklapanjaUgovora;
    private String prodavac;
    private FizickoLice kupac;
    private int cenaNekretnine;
    private String adresaNekretnine;
    public double procenatZarade(){
        if (kupac.isVecKupovalaNekretninu()){
            return 0.02;
        } else {
            return 0.03;
        }
    }

    public String getDatumSklapanjaUgovora() {
        return datumSklapanjaUgovora;
    }

    public String getProdavac() {
        return prodavac;
    }

    public FizickoLice getKupac() {
        return kupac;
    }

    public int getCenaNekretnine() {
        return cenaNekretnine;
    }

    public String getAdresaNekretnine() {
        return adresaNekretnine;
    }

    public Ugovor(String datumSklapanjaUgovora, String prodavac, FizickoLice kupac,
                  int cenaNekretnine, String adresaNekretnine) {
        this.datumSklapanjaUgovora = datumSklapanjaUgovora;
        this.prodavac = prodavac;
        this.kupac = kupac;
        this.cenaNekretnine = cenaNekretnine;
        this.adresaNekretnine = adresaNekretnine;
    }

    public double zaradaAgencije(){
        return 1000 + this.cenaNekretnine * procenatZarade();
    }

    public void stampajUgovor(){
        System.out.println("Dana " + this.datumSklapanjaUgovora + "god sklopljen je ugovor izmedju "
                + this.prodavac + " i " + this.kupac.getImeIPrezime() + " o kupovini nekretnine "
                + this.adresaNekretnine + " po ceni od " + this.cenaNekretnine +  " pri cemu je kupac u obavezi da agenciji isplati " +
                "novcanu vrednost u iznosu od " + this.zaradaAgencije());
    }

}
