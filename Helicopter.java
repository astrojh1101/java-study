public class Helicopter { //객체 : 헬리콥터
    //필드
    String modelname; //모델명
    String color; //색상
    int productionyear; //생산연도(ex. 2018)

    //생성자
    Helicopter(String modelname, String color, int productionyear) {
        this.modelname = modelname;
        this.color = color;
        this.productionyear = productionyear;
    }

    //매서드
    void takeoff(){
        System.out.println("이륙합니다.");
    }

    void upaltitude() {
        System.out.println("고도를 높입니다.");
    }

    void fixaltitude() {
        System.out.println("고도를 고정합니다.");
    }

    void downaltitude() {
        System.out.println("고도를 낮춥니다.");
    }

    void land(){
        System.out.println("착륙합니다.");
    }
}
