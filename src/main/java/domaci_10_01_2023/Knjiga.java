package domaci_10_01_2023;

public class Knjiga {
    private String isbn;
    private String nazivKnjige;
    private int godinaIzdanja;
    private Autor autor;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNazivKnjige() {
        return nazivKnjige;
    }

    public void setNazivKnjige(String nazivKnjige) {
        this.nazivKnjige = nazivKnjige;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Knjiga(String isbn, String nazivKnjige, int godinaIzdanja, Autor autor) {
        this.isbn = isbn;
        this.nazivKnjige = nazivKnjige;
        this.godinaIzdanja = godinaIzdanja;
        this.autor = autor;
    }
    public void stampajKnjigu(){
        System.out.println("ISBN: " + this.isbn);
        System.out.println(this.nazivKnjige + " - " + this.godinaIzdanja);
        System.out.println("Autor: " + this.autor.getIme() + " " + this.autor.getPrezime());
    }
}
