package p17_01_2023;

public class StudentMaster extends Student{

    public StudentMaster(String imeIPrezime, int brojIndeksa, int godinaStudija) {
        super(imeIPrezime, brojIndeksa, godinaStudija);
    }

    @Override
    public double cenaSkolarine() {
        return 100000;
    }

    @Override
    public boolean daLiJeNaBudzetu() {
        return this.godinaStudija < 5;
    }
}
