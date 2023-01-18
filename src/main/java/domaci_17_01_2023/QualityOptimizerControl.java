package domaci_17_01_2023;

public class QualityOptimizerControl extends Control {
    private double brzinaInterneta;

    public QualityOptimizerControl(){

    }
    public QualityOptimizerControl(double brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }

    public double getBrzinaInterneta() {
        return brzinaInterneta;
    }

    public void setBrzinaInterneta(double brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }
    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        if (this.brzinaInterneta * 10.1 < 144){
            videoPlayer.setKvalitetVidea("144");
        } else if (this.brzinaInterneta * 10.1 < 240) {
            videoPlayer.setKvalitetVidea("240");
        } else if (this.brzinaInterneta * 10.1 < 720) {
            videoPlayer.setKvalitetVidea("720");
        } else if (this.brzinaInterneta * 10.1 < 1080) {
            videoPlayer.setKvalitetVidea("1080");
        }
    }
}
