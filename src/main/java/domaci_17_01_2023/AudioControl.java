package domaci_17_01_2023;

public class AudioControl extends Control{

    private boolean menjajZvuk;

    public boolean isMenjajZvuk() {
        return menjajZvuk;
    }

    public void setMenjajZvuk(boolean menjajZvuk) {
        this.menjajZvuk = menjajZvuk;
    }

    public AudioControl(boolean menjajZvuk) {
        this.menjajZvuk = menjajZvuk;
    }
    public AudioControl(){

    }
    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        if (this.menjajZvuk) {
            int povecanZvuk = videoPlayer.getJacinaZvuka() + 1;
            videoPlayer.setJacinaZvuka(povecanZvuk);
            if (povecanZvuk > 100) {
                povecanZvuk = 100;
            }
        } else {
                int smanjenZvuk = videoPlayer.getJacinaZvuka() - 1;
                videoPlayer.setJacinaZvuka(smanjenZvuk);
                if (smanjenZvuk < 0){
                    smanjenZvuk = 0;
                }
        }
    }
}

