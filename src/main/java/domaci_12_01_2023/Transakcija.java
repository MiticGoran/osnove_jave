package domaci_12_01_2023;

public class Transakcija {
    private String idTransakcije;
    private Racun racunSaKogSeSalje;
    private Racun racunNaKojiSeSalje;

    public String getIdTransakcije() {
        return idTransakcije;
    }

    public void setIdTransakcije(String idTransakcije) {
        this.idTransakcije = idTransakcije;
    }

    public Racun getRacunSaKogSeSalje() {
        return racunSaKogSeSalje;
    }

    public void setRacunSaKogSeSalje(Racun racunSaKogSeSalje) {
        this.racunSaKogSeSalje = racunSaKogSeSalje;
    }

    public Racun getRacunNaKojiSeSalje() {
        return racunNaKojiSeSalje;
    }

    public void setRacunNaKojiSeSalje(Racun racunNaKojiSeSalje) {
        this.racunNaKojiSeSalje = racunNaKojiSeSalje;
    }

    public Transakcija(String idTransakcije, Racun racunSaKogSeSalje, Racun racunNaKojiSeSalje) {
        this.idTransakcije = idTransakcije;
        this.racunSaKogSeSalje = racunSaKogSeSalje;
        this.racunNaKojiSeSalje = racunNaKojiSeSalje;
    }
    private double provizija(double transakcija){
        if (transakcija < 4500){
            return 45;
        } else {
            return transakcija * (1.0 / 100);
        }
    }


    public void izvrsiTransakciju(double transfer){
        double novoStanjeSaKogSeSalje = this.racunSaKogSeSalje.getStanjeNaRacunu() -
                (transfer + provizija(transfer));
        double novoStanjeNaKojiSeSalje = this.racunNaKojiSeSalje.getStanjeNaRacunu() + transfer;
        this.racunSaKogSeSalje.menjajStanjeNaRacunu(this.racunSaKogSeSalje.getStanjeNaRacunu() -
                (transfer + provizija(transfer)));
        this.racunNaKojiSeSalje.menjajStanjeNaRacunu(this.racunNaKojiSeSalje.getStanjeNaRacunu()
                + transfer);
    }

    public void stampajPodatkeOTransakciji(){
        System.out.println("ID transakcije: " + this.idTransakcije);
        System.out.println("Racun sa: " + this.racunSaKogSeSalje.getImeIPrezimeOsobe() + " - Broj racuna: "
        + this.racunSaKogSeSalje.getBrojRacuna() + " Stanje na racunu: "
                + this.racunSaKogSeSalje.getStanjeNaRacunu());
        System.out.println("Racun na: " + this.racunNaKojiSeSalje.getImeIPrezimeOsobe() + " - Broj racuna: "
                + this.racunNaKojiSeSalje.getBrojRacuna() + " Stanje na racunu: "
                + this.racunNaKojiSeSalje.getStanjeNaRacunu());
    }

}
