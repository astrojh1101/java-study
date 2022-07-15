package chap07.ownexcode.typeconvert;

public class LOL extends Game {
    @Override // 롤 클래스는 게임 클래스 상속함, 게임 클래스 내 메서드를 롤 클래스에서 재정의
    public void play() {
        System.out.println("리그 오브 레전드를 플레이합니다.");
    }
    public void pause() {
        System.out.println("플레이 중인 리그 오브 레전드를 일시정지합니다.");
    }
    public void exit() {
        System.out.println("플레이 중인 리그 오브 레전드를 강제종료합니다.");
    }
}
