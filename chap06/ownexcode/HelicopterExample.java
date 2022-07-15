package chap06.ownexcode;

public class HelicopterExample {
    public static void main(String[] args) {
        Helicopter hc1 = new Helicopter("랩터", "검정", 2020);

        hc1.takeoff();
        hc1.upAltitude();
        hc1.fixAltitude();
        hc1.downAltitude();
        hc1.land();

        System.out.println("무사귀환했습니다.");
    }
}
