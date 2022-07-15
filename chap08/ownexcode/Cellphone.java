package chap08.ownexcode;

public class Cellphone implements Call, Message, Record {

    // 추상 메소드의 실체 메소드 작성
    public void sendCall() {
        System.out.println("전화를 겁니다.");
    }
    public void receiveCall() {
        System.out.println("전화를 수신합니다.");
    }
    public void sendMessage() {
        System.out.println("메세지를 보냅니다.");
    }
    public void receiveMessage() {
        System.out.println("메세지를 수신합니다.");
    }
    public void onRecord() {
        System.out.println("녹음을 시작합니다.");
    }
    public void pauseRecord() {
        System.out.println("녹음을 잠시 멈춥니다.");
    }
    public void offRecord() {
        System.out.println("녹음을 종료합니다.");
    }
}
