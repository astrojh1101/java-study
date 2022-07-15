package chap07.ownexcode.abstclass;

public abstract class Watch { //추상 클래스 : 클래스들의 공통적인 특성을 추출해 선언한 클래스

    public String brand;
    public String model;
    public int mm;

    public Watch(String brand, String model, int mm) {
        this.brand = brand;
        this.model = model;
        this.mm = mm;
    }

    public void showCurrentTime() {
        System.out.println("현재 시간을 보여줍니다.");
    }
    public void ringNotice() {
        System.out.println("알림이 도착했습니다.");
    }

}
