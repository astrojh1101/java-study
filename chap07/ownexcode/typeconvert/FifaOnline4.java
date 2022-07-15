package chap07.ownexcode.typeconvert;

public class FifaOnline4 extends Game {
    @Override // 피파온라인4 클래스는 게임 클래스 상속함, 게임 클래스 내 메서드를 피파온라인4 클래스에서 재정의
    public void play() {
        System.out.println("피파온라인4를 플레이합니다.");
    }
    public void pause() {
        System.out.println("플레이 중인 피파온라인4를 일시정지합니다.");
    }
    public void exit() {
        System.out.println("플레이 중인 피파온라인4를 강제종료합니다.");
    }
}
