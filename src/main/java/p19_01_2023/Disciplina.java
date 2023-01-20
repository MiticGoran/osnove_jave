package p19_01_2023;

import java.util.ArrayList;

public class Disciplina {
    private String imeDiscipline;
    private String tipDiscipline;
    private ArrayList<Atleticar> nizAtleticara;

    public Disciplina(){
        this.nizAtleticara = new ArrayList<Atleticar>();
    }
    public Disciplina(String imeDiscipline, String tipDiscipline) {
        this.imeDiscipline = imeDiscipline;
        this.tipDiscipline = tipDiscipline;
        this.nizAtleticara = new ArrayList<Atleticar>();
    }
    public String getImeDiscipline() {
        return imeDiscipline;
    }

    public void setImeDiscipline(String imeDiscipline) {
        this.imeDiscipline = imeDiscipline;
    }

    public String getTipDiscipline() {
        return tipDiscipline;
    }

    public void setTipDiscipline(String tipDiscipline) {
        this.tipDiscipline = tipDiscipline;
    }

    public void dodajAtleticara(Atleticar atleticar){
        this.nizAtleticara.add(atleticar);
    }
    public void diskvalifikujAtleticara(String imeIPrezime){
        for (int i = 0; i < this.nizAtleticara.size(); i++) {
            if (this.nizAtleticara.get(i).getImeIPrezime().equals(imeIPrezime)){
                this.nizAtleticara.remove(i);
            }
        }
    }
    public Atleticar nadjiNajboljeg(){
        Atleticar najbolji = this.nizAtleticara.get(0);
        for (int i = 0; i < this.nizAtleticara.size(); i++) {
            if (this.nizAtleticara.get(i).koJeBolji(najbolji)){
                najbolji = this.nizAtleticara.get(i);
            }
        }
        return najbolji;
    }
    public void stampajPobednika(){
        this.nadjiNajboljeg().stampaj();
    }

}
