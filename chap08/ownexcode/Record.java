package chap08.ownexcode;

public interface Record { // 인터페이스 상에는 추상 메소드 작성
    public void onRecord();
    public void pauseRecord();
    public void offRecord();
}
