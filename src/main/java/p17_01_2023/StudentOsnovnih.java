package p17_01_2023;

public class StudentOsnovnih extends Student{

    public StudentOsnovnih(String imeIPrezime, int brojIndeksa, int godinaStudija) {
        super(imeIPrezime, brojIndeksa, godinaStudija);
    }
    @Override
    public double cenaSkolarine() {
        return 9000;
    }
    @Override
    public boolean daLiJeNaBudzetu() {
        return this.godinaStudija < 5;
    }
}
