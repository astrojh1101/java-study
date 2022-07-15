package chap07.Exercise.Exercise0725;

public class Exercise0725 {
    public static void main(String[] args) {
        Outer outer = new Outer(); // 내부 클래스가 인스턴스 클래스이므로, 외부 클래스의 인스턴스를 제일 먼저 생성하여야 함
        Outer.Inner inner = outer.new Inner();
        System.out.println(inner.iv);
    }
}
