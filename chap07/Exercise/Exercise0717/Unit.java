package chap07.Exercise.Exercise0717;

public abstract class Unit {
    int x, y;
    abstract void move(int x, int y);
    void stop(){} // 세 클래스의 공통 부분
}
