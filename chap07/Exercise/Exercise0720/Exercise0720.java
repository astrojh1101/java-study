package chap07.Exercise.Exercise0720;

public class Exercise0720 {
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();

        System.out.println("p.x = " +p.x);
        p.method();

        System.out.println("c.x = "+c.x);
        c.method();
    }
}

// 메서드는 Child클래스에 정의된 메서드 호출, x는 참조변수 타입에 따라 다름
