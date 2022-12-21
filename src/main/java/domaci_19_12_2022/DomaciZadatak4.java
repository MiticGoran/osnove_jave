package domaci_19_12_2022;

//        Napisati program koji vodi evidenciju koliko je uneto sledecih reakcija.
//        Korisnik unosi N rekacija zatim se prikazuje evidencija:
//        Program podrzava sledece reakcije:
//        like
//        smile
//        heart
//        Primer izvrsenja:
//        Unesite N: 7
//        Reaguj: like
//        Reaguj: heart
//        Reaguj: smile
//        Reaguj: lol
//        Reaguj: smile
//        Reaguj: like
//        Reaguj: like
//        Summary: like 3 | smile 2 | heart 1

import java.util.Scanner;

public class DomaciZadatak4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N: ");
        int n = s.nextInt();
        int like = 0;
        int smile = 0;
        int heart = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Reaguj: ");
            String reakcija = s.next();
            if (reakcija.equals("like")){
                like++;
            } else if (reakcija.equals("smile")) {
                smile++;

            } else if (reakcija.equals("heart")) {
                heart++;
            }
        }
        System.out.println("Summary: " + "like " + like + " | " + "smile " + smile + " | " + "heart " + heart);
    }
}
