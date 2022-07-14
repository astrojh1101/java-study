package chap07.ownexcode.abstclass;

public class AppleWatch extends Watch { //실체클래스(자식)와 추상클래스(부모)는 상속 관계

    public AppleWatch(String brand, String model, int mm) {
        super(brand, model, mm) ;
    } //추상클래스 속성 물려받음


    public void callSiri() {
        System.out.println("시리를 호출합니다.");
    } //실체 클래스만의 추가적인 특성 가짐
}
