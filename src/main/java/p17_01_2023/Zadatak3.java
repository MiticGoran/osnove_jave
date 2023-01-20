package p17_01_2023;

import java.util.ArrayList;

public class Zadatak3 {
    public static void main(String[] args) {
        JednakostranicniTrougao f1 = new JednakostranicniTrougao(3);
        JednakostranicniTrougao f3 = new JednakostranicniTrougao(5);
        Pravugaonik f2 = new Pravugaonik(2, 3);
        Pravugaonik f4 = new Pravugaonik(6, 11);
        Pravugaonik f5 = new Pravugaonik(10, 4);

        ArrayList<Figura> figure = new ArrayList<Figura>();
        figure.add(f1);
        figure.add(f2);
        figure.add(f3);
        figure.add(f4);
        figure.add(f5);

        for (int i = 0; i < figure.size(); i++) {
            figure.get(i).stampaj();
        }
        double obimSvih = 0;
        double povrsinaSvih = 0;
        for (int i = 0; i < figure.size(); i++) {
                   obimSvih = obimSvih + figure.get(i).obim();
        }
        System.out.println("Obim svih: " + obimSvih);

        for (int i = 0; i < figure.size(); i++) {
            povrsinaSvih = povrsinaSvih + figure.get(i).povrsina();
        }
        System.out.println("Povrsina svih: " + povrsinaSvih);
    }
}
