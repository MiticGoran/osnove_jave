package domaci_14_12_2022;

import java.util.Scanner;

//        Napisati program koji u zavisnosti od operatora koji unosi korisnik sa tastature
//        (operator je string i moze imati vrednosti +, - , *, /) racuna  i ispisuje na ekranu
//        odgovarajuci zbir, razliku, proizvod ili kolicnik za dva broja a i b uneta sa tastature.

public class DomaciZadatak5 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite a: ");
        int a = s.nextInt();

        System.out.println("Unesite operator: ");
        String operator = s.next();

        System.out.println("Unesite b: ");
        int b = s.nextInt();

        int c = 0;

        if(operator.equals("+")) {
            c = a + b;
        } else if(operator.equals("-")){
            c = a - b;

        } else if(operator.equals("*")){
            c = a * b;

        } else if(operator.equals("/")){
            c = a / b;

        }
        System.out.println("Rezultat: " + c);
    }
}
