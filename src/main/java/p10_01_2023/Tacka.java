package p10_01_2023;

public class Tacka {
    private int x;
    private int y;

    public void stampaj(){
        System.out.println(this.x + " " + this.y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Tacka(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Tacka(){
    }
}
