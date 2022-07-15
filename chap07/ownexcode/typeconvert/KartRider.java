package chap07.ownexcode.typeconvert;

public class KartRider extends Game {
    @Override // 카트라이더 클래스는 게임 클래스 상속함, 게임 클래스 내 메서드를 카트라이더 클래스에서 재정의
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
