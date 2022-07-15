package chap08.ownexcode.typeconvert;

public class LOL implements Game {
    @Override // 게임 인터페이스에 추상 메서드 작성 후, 실체 메서드 재정의
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
