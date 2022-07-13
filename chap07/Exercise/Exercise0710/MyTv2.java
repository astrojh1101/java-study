package chap07.Exercise.Exercise0710;

public class MyTv2 {
    private boolean isPowerOn;
    private int channel;
    private int volume; // 외부에서 접근할 수 없도록 제어자 private 붙임

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
    } // 멤버변수들의 값을 어디서나 읽고 변경할 수 있도록 제어자 public 붙인 후 getter, setter 메소드 추가
}
