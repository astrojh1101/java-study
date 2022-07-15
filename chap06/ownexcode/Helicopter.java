package chap06.ownexcode;

public class Helicopter { //객체 : 헬리콥터
    //필드 (인스턴스 필드)
    String modelname; //모델명
    String color; //색상
    int productionyear; //생산연도(ex. 2018)

    //생성자
    Helicopter(String modelname, String color, int productionyear) {
        this.modelname = modelname;
        this.color = color;
        this.productionyear = productionyear;
    } // 객체 내부에서 인스턴스 멤버에 접근하기 위해 this를 사용하며 + 필드를 명시함

    //매서드
    void takeoff(){
        System.out.println(this.modelname+"가 이륙합니다.");
    }

    void upaltitude() {
        System.out.println(this.modelname+"가 고도를 높입니다.");
    }

    void fixaltitude() {
        System.out.println(this.modelname+"가 고도를 고정하고 비행합니다.");
    }

    void downaltitude() {
        System.out.println(this.modelname+"가 고도를 낮춥니다.");
    }

    void land(){
        System.out.println(this.modelname+"가 착륙합니다.");
    }
}
