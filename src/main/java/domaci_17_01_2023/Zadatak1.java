package domaci_17_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        VideoPlayer v1 = new VideoPlayer(1200, 900, 70, "1080");

        v1.stampaj();
        TimeControl t1 = new TimeControl();
        t1.setPomeraj(true);
        t1.izvrsiAkciju(v1);

        AudioControl a1 = new AudioControl();
        a1.setMenjajZvuk(true);
        a1.izvrsiAkciju(v1);
        a1.setMenjajZvuk(true);
        a1.izvrsiAkciju(v1);
        a1.setMenjajZvuk(false);
        a1.izvrsiAkciju(v1);

        QualityOptimizerControl q1 = new QualityOptimizerControl();
        q1.setBrzinaInterneta(60);
        q1.izvrsiAkciju(v1);

        v1.stampaj();
    }
}
