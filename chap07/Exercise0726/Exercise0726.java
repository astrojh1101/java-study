package chap07.Exercise0726;

public class Exercise0726 {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner(); // 내부 클래스가 정적 클래스이므로 외부 클래스의 객체가 없이도 사용 가능
        System.out.println(inner.iv);
    }
}
