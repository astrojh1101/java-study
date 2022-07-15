package chap07.Exercise.Exercise0722;

public class Circle extends Shape {
    double r; // 반지름

    Circle(double r) {
        this(new Point(0,0), r);
    }

    Circle(Point p, double r) {
        super(p);
        this.r = r;
    }

    @Override // 도형 면적을 계산해서 반환하는 calcArea 메서드를, 원의 넓이를 구해서 반환하도록 재정의
    double calcArea() {
        return r * r * Math.PI;
    } // Math.PI 대신 3.14 넣으면 연습문제 실행결과와 다르게 나옴
}
