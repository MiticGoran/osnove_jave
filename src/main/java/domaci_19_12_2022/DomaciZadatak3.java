package domaci_19_12_2022;

//        Napisati program koji simulira ponasanje speak loud programa.
//        Korisnik unosi N reci a program ispisuje svaku rec na ekranu tako da zadovolji uslov:
//        ako se u unetom tekstu sadrzi ! onda ga ispise tako kako je unet
//        ako se ne sadrzi, program dostampa na kraju
//        Nakon toga program ispisuje nivo agresivnosti u komunikaciji (u procentima).
//        Svaka uneta rec sa ! utice na agresivnost.
//        Primer izvrsenja:
//        Unesite N: 5
//        Unesite tekst: Cao!
//        Cao!
//        Unesite tekst: Hello
//        Hello!
//        Unesite tekst: Hi!
//        Hi!
//        Unesite tekst: Cuti
//        Cuti!
//        Unesite tekst: Ajde!
//        Ajde!
//        Nivo agresivnosti 60.
//        (Objasnjenje, 60% jer je od 5 unetih reci, 3 bilo sa !)

import java.util.Scanner;

public class DomaciZadatak3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N: ");
        int n = s.nextInt();
        int nivoAgresivnosti = 0;
        int nivo = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite tekst: ");
            String tekst = s.next();
            if (tekst.contains("!")) {
                nivoAgresivnosti = nivoAgresivnosti + 1;
                System.out.println(tekst);

            } else {
                System.out.println(tekst + "!");
            }
            nivo = (int) ((nivoAgresivnosti * 1.0 / n) * 100);
        }

        System.out.println("Nivo agresivnosti " + nivo);

    }
}
