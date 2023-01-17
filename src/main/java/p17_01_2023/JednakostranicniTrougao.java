package p17_01_2023;

public class JednakostranicniTrougao extends Figura{

    private int a;

    public int getA() {
        return a;
    }

    public JednakostranicniTrougao(int a) {
        this.a = a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public double povrsina() {
        return (this.a * this.a) * 1.7325 / 4;
    }

    @Override
    public double obim() {
        return this.a * 3;
    }

}
