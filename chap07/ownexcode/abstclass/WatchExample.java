package chap07.ownexcode.abstclass;

public class WatchExample {
    public static void main(String[] args) {

        GalaxyWatch galaxywatch = new GalaxyWatch("SAMSUNG", "갤럭시 워치 4", 44);

        galaxywatch.showCurrentTime();
        galaxywatch.ringNotice();
        galaxywatch.callBixby();

        AppleWatch applewatch = new AppleWatch("Apple", "애플 워치 나이키 에디션", 40);

        applewatch.showCurrentTime();
        applewatch.ringNotice();
        applewatch.callSiri();
    }
}
