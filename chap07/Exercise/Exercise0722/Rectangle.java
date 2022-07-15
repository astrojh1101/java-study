package chap07.Exercise.Exercise0722;

public class Rectangle extends Shape {
    double width; // 폭
    double height; // 반지름

    Rectangle(double width, double height) {
        this(new Point(0,0), width, height);
    }

    Rectangle(Point p, double width, double height) {
        super(p);
        this.width = width;
        this.height = height;
    }

    @Override
    double calcArea() {
        return width * height;
    }

    boolean isSquare() {
        return width*height !=0 &&(width == height);
    }
}
