package p19_12_2022;
//    Napisati program koji sumira parne brojeve od 1 do 50 i na kraju programa ispisuje sumu.
public class Zadatak2 {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0){
                suma = suma + i;
            }
        }
        System.out.println("Suma je " + suma);
    }
}
