package chap04;

public class Practice0414 {
    public static void main(String[] args)
    {
    // 1~100 사이의 임의의 값을 얻어서 answer에 저장한다.
    int answer = (int)(Math.random()*100)+1; // chap04.Practice0407 문제와 유사, 1~100사이에서 임의의 값 추출하는 연산식
    int input = 0; // 사용자 입력을 저장할 공간
    int count = 0; // 시도 횟수를 세기 위한 변수

        // 화면으로부터 사용자 입력을 받기 위해서 Scanner 클래스 사용
        java.util.Scanner s = new java.util.Scanner(System.in);

        do {
            count++;
            System.out.print("1과 100사이의 값을 입력하세요 :");
            input = s.nextInt(); // 입력받을 값을 변수 input에 저장한다.

            if(answer > input) {
                System.out.println("더 큰 수를 입력하세요."); // answer가 input보다 크면 더 큰 수를 입력하라는 내용 출력
            } else if(answer < input) {
                System.out.println("더 작은 수를 입력하세요."); // answer가 input보다 작으면 더 작은 수를 입력하라는 내용 출력
            } else { // 값을 맞추었을 경우 다음 내용 출력
                System.out.println("맞췄습니다.");
                System.out.println("시도횟수는 "+count+"번입니다.");
                break;
            }

        } while(true); // 무한반복문
    } // end of main
} // end of class HighLow
