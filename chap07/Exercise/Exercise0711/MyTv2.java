package chap07.Exercise.Exercise0711;

public class MyTv2 {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prevCh;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public void setPowerOn(boolean isPowerOn) {
        this.isPowerOn = isPowerOn;
    }
    public int getChannel() {
        return channel;
    }
    public void setChannel(int channel) {
        if(channel > MAX_CHANNEL || channel < MIN_CHANNEL) return;
        this.channel = channel;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        if(volume > MAX_VOLUME || volume < MIN_VOLUME) return;
            this.volume = volume;
    }

    public void gotoPrevChannel() {
        setChannel(prevCh);
    }
}
