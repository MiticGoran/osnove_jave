package domaci_12_01_2023;

import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {
        ZeleniKarton z1 = new ZeleniKarton("Goran Mitic", "858",
                "Hidrologija", "Rasa Ivanovic", 8);
        ZeleniKarton z2= new ZeleniKarton("Pera Peric", "859",
                "Rusija", "Ivan Petrovic", 6);
        ZeleniKarton z3 = new ZeleniKarton("Dragan Pitic", "863",
                "Azija", "Milan Milanovic", 6);
        ZeleniKarton z4 = new ZeleniKarton("Goran Stankovic", "838",
                "Evropa", "Petar Ivanovic", 8);
        ZeleniKarton z5 = new ZeleniKarton("Stefan Stefanovic", "458",
                "Amerika", "Mitar Miric", 6);
        ZeleniKarton z6 = new ZeleniKarton("Pavle Stanic", "758",
                "Srbija", "Miroljub Miric", 7);
        ZeleniKarton z7 = new ZeleniKarton("Stefan Mitic", "848",
                "Klimatologija 2", "Stanko Ivanovic", 10);
        ZeleniKarton z8 = new ZeleniKarton("Vladimir Vladic", "833",
                "Naselja", "Petar Petrovic", 9);
        ZeleniKarton z9 = new ZeleniKarton("Peca Pecic", "855",
                "Klasika", "Rasa Ivanovic", 5);
        ZeleniKarton z10 = new ZeleniKarton("Goran Klasic", "866",
                "Geomorfologija", "Ivan Ivanovic", 7);
        ZeleniKarton z11 = new ZeleniKarton("Goran Mitic", "858",
                "Klimatologija", "Dragoljub Dragic", 10);

        ArrayList<ZeleniKarton> ocene = new ArrayList<ZeleniKarton>();
        ocene.add(z1);
        ocene.add(z2);
        ocene.add(z3);
        ocene.add(z4);
        ocene.add(z5);
        ocene.add(z6);
        ocene.add(z7);
        ocene.add(z8);
        ocene.add(z9);
        ocene.add(z10);
        ocene.add(z11);

        z1.stampajKarton();
        z11.stampajKarton();
        z3.stampajKarton();
        System.out.println("Da li je polozen ispit? " + z9.getImeIPrezimeStudenta() + ": " + z9.polozio());
        int counter = 0;
        double suma = 0;
        double prosecnaOcena = 0;
        for (int i = 0; i < ocene.size(); i++) {
            if(ocene.get(i).getOcena() > 5){
                counter = counter + 1;
                suma = suma + ocene.get(i).getOcena();
                prosecnaOcena = suma / counter;
            }
        }
        System.out.println("Prosecna ocena svih polozenih ispita je: " + prosecnaOcena);
    }
}
