package p13_12_2022;

import java.sql.SQLOutput;

public class Zadatak1 {
    public static void main(String[] args) {

//Napisati program koji na ekranu stampa podatke u formatu:
//[IME I PREZIME]
//[BROJ TELEFONA], [ULICA I BROJ], [GRAD]
//[EMAIL]

        String imePrezime = "Goran Mitic";
        String brojTelefona = "069555333";
        String adresa = "Dusanova 69";
        String grad = "Krusevac";
        String email = "goran@gmail.com";

        System.out.println(imePrezime);
        System.out.println(brojTelefona + ", " + adresa + ", " + grad);
        System.out.println(email);


    }



}
