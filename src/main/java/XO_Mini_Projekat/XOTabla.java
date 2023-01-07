package XO_Mini_Projekat;

public class XOTabla {
    private String polje1;
    private String polje2;
    private String polje3;
    private String polje4;
    private String polje5;
    private String polje6;
    private String polje7;
    private String polje8;
    private String polje9;
    private String imeXIgraca;
    private String imeOIgraca;
    private String naPotezu;
    private String igrac;
    public void setImeXIgraca(String ImeXIgraca){
        this.imeXIgraca = ImeXIgraca;
    }
    public void setImeOIgraca(String ImeOIgraca){
        this.imeOIgraca = ImeOIgraca;
    }
    public String getImeXIgraca(){
        return this.imeXIgraca;
    }
    public String getImeOIgraca(){
        return this.imeOIgraca;
    }
    public String getNaPotezu(){
        return this.naPotezu;
    }
    public void pokreniIgru(){
        this.polje1 = " ";
        this.polje2 = " ";
        this.polje3 = " ";
        this.polje4 = " ";
        this.polje5 = " ";
        this.polje6 = " ";
        this.polje7 = " ";
        this.polje8 = " ";
        this.polje9 = " ";
        this.naPotezu = "X";
    }
    public void stampaj(){
        System.out.println(polje1 + " | " + polje2 + " | " + polje3);
        System.out.println(polje4 + " | " + polje5 + " | " + polje6);
        System.out.println(polje7 + " | " + polje8 + " | " + polje9);
        System.out.println("Igrac X: " + this.imeXIgraca);
        System.out.println("Igrac O: " + this.imeOIgraca);
        System.out.println("Na potezu igrac " + this.naPotezu);
    }
    public boolean poljePrazno(String brojPolja){
        if (brojPolja.equals("1") && this.polje1.equals(" ")){
            return true;
        } else if (brojPolja.equals("2") && this.polje2.equals(" ")) {
            return true;
        } else if (brojPolja.equals("3") && this.polje3.equals(" ")) {
            return true;
        } else if (brojPolja.equals("4") && this.polje4.equals(" ")) {
            return true;
        } else if (brojPolja.equals("5") && this.polje5.equals(" ")) {
            return true;
        } else if (brojPolja.equals("6") && this.polje6.equals(" ")) {
            return true;
        } else if (brojPolja.equals("7") && this.polje7.equals(" ")) {
            return true;
        } else if (brojPolja.equals("8") && this.polje8.equals(" ")) {
            return true;
        } else if (brojPolja.equals("9") && this.polje9.equals(" ")) {
            return true;
        }
        else {
            return false;
        }
    }

    public String zameniIgraca(){
        if (this.naPotezu.equals("X")){
            return this.naPotezu = "O";
        }else {
            return this.naPotezu = "X";
        }
    }
    public void odigrajPotez(String brojPolja){
        if (brojPolja.equals("1") && naPotezu.equals("X")){
            this.polje1 = "X";
        } else if (brojPolja.equals("2") && naPotezu.equals("X")) {
            this.polje2 = "X";
        } else if (brojPolja.equals("3") && naPotezu.equals("X")) {
            this.polje3 = "X";
        } else if (brojPolja.equals("4") && naPotezu.equals("X")) {
            this.polje4 = "X";
        } else if (brojPolja.equals("5") && naPotezu.equals("X")) {
            this.polje5 = "X";
        } else if (brojPolja.equals("6") && naPotezu.equals("X")) {
            this.polje6 = "X";
        } else if (brojPolja.equals("7") && naPotezu.equals("X")) {
            this.polje7 = "X";
        } else if (brojPolja.equals("8") && naPotezu.equals("X")) {
            this.polje8 = "X";
        } else if (brojPolja.equals("9") && naPotezu.equals("X")) {
            this.polje9 = "X";
        } else if (brojPolja.equals("1") && naPotezu.equals("O")) {
            this.polje1 = "O";
        } else if (brojPolja.equals("2") && naPotezu.equals("O")) {
            this.polje2 = "O";
        } else if (brojPolja.equals("3") && naPotezu.equals("O")) {
            this.polje3 = "O";
        } else if (brojPolja.equals("4") && naPotezu.equals("O")) {
            this.polje4 = "O";
        } else if (brojPolja.equals("5") && naPotezu.equals("O")) {
            this.polje5 = "O";
        } else if (brojPolja.equals("6") && naPotezu.equals("O")) {
            this.polje6 = "O";
        } else if (brojPolja.equals("7") && naPotezu.equals("O")) {
            this.polje7 = "O";
        } else if (brojPolja.equals("8") && naPotezu.equals("O")) {
            this.polje8 = "O";
        } else if (brojPolja.equals("9") && naPotezu.equals("O")) {
            this.polje9 = "O";
        } else if (!(poljePrazno(brojPolja))) {
            System.out.println("Potez nije validan");
        }
    }
    public boolean popunjenaTabla(){
        if (!(this.polje1.equals(" ") || this.polje2.equals(" ") || this.polje3.equals(" ") || this.polje4.equals(" ")
            || this.polje5.equals(" ") ||this.polje6.equals(" ") || this.polje7.equals(" ") ||
            this.polje8.equals(" ") || this.polje9.equals(" "))){
            return true;
        } else return false;
    }
    public boolean pobednikX(){
        if (this.polje1.equals("X") && this.polje2.equals("X") && this.polje3.equals("X")){
            return true;
        } else if (this.polje4.equals("X") && this.polje5.equals("X") && this.polje6.equals("X")){
            return true;
        } else if (this.polje7.equals("X") && this.polje8.equals("X") && this.polje9.equals("X")){
            return true;
        } else if (this.polje1.equals("X") && this.polje4.equals("X") && this.polje7.equals("X")){
            return true;
        } else if (this.polje2.equals("X") && this.polje5.equals("X") && this.polje8.equals("X")){
            return true;
        } else if (this.polje3.equals("X") && this.polje6.equals("X") && this.polje9.equals("X")){
            return true;
        } else if (this.polje1.equals("X") && this.polje5.equals("X") && this.polje9.equals("X")){
            return true;
        } else if (this.polje3.equals("X") && this.polje5.equals("X") && this.polje7.equals("X")){
            return true;
        } else {
            return false;
        }
    }
    public boolean pobednikO(){
        if (this.polje1.equals("O") && this.polje2.equals("O") && this.polje3.equals("O")){
            return true;
        } else if (this.polje4.equals("O") && this.polje5.equals("O") && this.polje6.equals("O")){
            return true;
        } else if (this.polje7.equals("O") && this.polje8.equals("O") && this.polje9.equals("O")){
            return true;
        } else if (this.polje1.equals("O") && this.polje4.equals("O") && this.polje7.equals("O")){
            return true;
        } else if (this.polje2.equals("O") && this.polje5.equals("O") && this.polje8.equals("O")){
            return true;
        } else if (this.polje3.equals("O") && this.polje6.equals("O") && this.polje9.equals("O")){
            return true;
        } else if (this.polje1.equals("O") && this.polje5.equals("O") && this.polje9.equals("O")){
            return true;
        } else if (this.polje3.equals("O") && this.polje5.equals("O") && this.polje7.equals("O")){
            return true;
        } else {
            return false;
        }
    }
}
