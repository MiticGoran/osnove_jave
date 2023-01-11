package p10_01_2023;

public class MainFilmReziser {
    public static void main(String[] args) {
        Film f = new Film("Opasan film", 2022);
        Reziser r = new Reziser("Neki Reziser", 62);
        f.stampaj();
        r.stampajRezisera();
        f.setFilmJeRezirao(r);
    }
}
