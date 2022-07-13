package chap07.Exercise.Exercise0707;

public class Parent {
    int x = 100;

    Parent() {
        this(200);
    }

    Parent(int x) {
        this.x = x;
    }

    int getX() {
        return x;
    }
} // Child() -> Child(int x) -> Parent() -> Parent(int x) -> 객체 순서로 호출.
