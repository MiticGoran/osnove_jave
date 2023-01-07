package XO_Mini_Projekat;

import java.util.Scanner;

public class IksOks {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        XOTabla igraci = new XOTabla();
        System.out.println("Unesite ime igraca X: ");
        String imeXIgraca = s.next();
        igraci.setImeXIgraca(imeXIgraca);
        System.out.println("Unesite ime igraca O: ");
        String imeOIgraca = s.next();
        igraci.setImeOIgraca(imeOIgraca);
        igraci.pokreniIgru();
//        igraci.pobednikX();
//        igraci.pobednikO();
//        igraci.popunjenaTabla();
//        System.out.println(igraci.popunjenaTabla());
        while(!(igraci.popunjenaTabla()) && !(igraci.pobednikX()) && !(igraci.pobednikO())){
            igraci.stampaj();
            System.out.println("Odigraj potez: ");
            String potez = s.next();
            if (igraci.poljePrazno(potez)) {
                igraci.odigrajPotez(potez);
                if (igraci.pobednikX()) {
                    System.out.println("Cestitamo! Pobednik je igrac X");
                    System.out.println("Bravo " + igraci.getImeXIgraca());
                } else if (igraci.pobednikO()) {
                    System.out.println("Cestitamo! Pobednik je igrac O");
                    System.out.println("Bravo " + igraci.getImeOIgraca());
                } else if (igraci.popunjenaTabla()) {
                    System.out.println("Igra je neresena.");
                }
                igraci.zameniIgraca();
            } else {
                System.out.println("Potez nije validan.");
            }
        }

    }
}
