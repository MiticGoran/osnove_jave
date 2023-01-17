package p17_01_2023;

public class Pravugaonik extends Figura{

    private int a;
    private int b;

    public Pravugaonik(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public double povrsina() {
        return a * b;
    }

    @Override
    public double obim() {
        return a * 2 + b * 2;
    }

}
