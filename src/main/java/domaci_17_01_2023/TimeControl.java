package domaci_17_01_2023;

public class TimeControl extends Control {

    private boolean pomeraj;
    public TimeControl() {
    }

    public boolean isPomeraj() {
        return pomeraj;
    }

    public void setPomeraj(boolean pomeraj) {
        this.pomeraj = pomeraj;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        if (this.pomeraj){
            double pomerenoVreme = videoPlayer.getTrenutnoVremeVidea() + 15.0;
            videoPlayer.setTrenutnoVremeVidea(pomerenoVreme);
            if (pomerenoVreme > videoPlayer.getDuzinaVidea()){
                pomerenoVreme = videoPlayer.getDuzinaVidea();
                videoPlayer.setTrenutnoVremeVidea(pomerenoVreme);
            }
        }
        else {
                double pomerenoVremeNazad = videoPlayer.getTrenutnoVremeVidea() - 15.0;
                videoPlayer.setTrenutnoVremeVidea(pomerenoVremeNazad);
                if (pomerenoVremeNazad < 0){
                    pomerenoVremeNazad = 0;
                    videoPlayer.setTrenutnoVremeVidea(pomerenoVremeNazad);
                 }
            }

    }
}
