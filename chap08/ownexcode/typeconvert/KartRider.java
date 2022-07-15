package chap08.ownexcode.typeconvert;

public class KartRider implements Game {
    @Override // 게임 인터페이스에 추상 메서드 작성 후, 실체 메서드 재정의
    public void play() {
        System.out.println("카트라이더를 플레이합니다.");
    }
    public void pause() {
        System.out.println("플레이 중인 카트라이더를 일시정지합니다.");
    }
    public void exit() {
        System.out.println("플레이 중인 카트라이더를 강제종료합니다.");
    }
}
