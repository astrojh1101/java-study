package chap04;

public class Exercise4103 {
    public static void main(String[] args) {
        int score = 85;
        System.out.print("등급은 ");
        if(score < 70) {
            System.out.println("D");
        } else if(score < 80) {
            System.out.println("C");
        } else if(score < 90) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }
        System.out.println("입니다.");
    }
}
