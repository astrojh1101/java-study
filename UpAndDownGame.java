import java.util.Scanner;

public class UpAndDownGame {
    public static void main(String[] args) {
        int count = 5; // 총 기회 5번
        int randomNumber = (int)(Math.random()*50)+1; // 1~50 사이 임의의 숫자 입력 받음
        int userNumber; // 사용자가 선택할 수
        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<5; i++) {
            System.out.println("도전 가능 횟수 : "+count+"회");
            userNumber = scanner.nextInt();
            if(userNumber < 0 || userNumber > 50) {
                System.out.println("적절하지 않은 숫자입니다.");
                i = i + 1; // 적절하지 않은 숫자 입력하였으므로 도전 가능 횟수 차감 X
            } else {
                if (userNumber == randomNumber) {
                    System.out.println("정답!!!");
                    break; // 정답을 맞췄으면 "정답!!!" 입력 후 게임 종료
                } else if (userNumber < randomNumber) {
                    System.out.println("Up");
                    count--; // 사용자가 선택할 수가 임의로 입력받은 수보다 작으면, "Up" 출력하고 도전 가능 횟수 1회 차감
                } else if (userNumber > randomNumber) {
                    System.out.println("Down");
                    count--; // 사용자가 선택할 수가 임의로 입력받은 수보다 크면, "Down" 출력하고 도전 가능 횟수 1회 차감
                }

                if (count==0) {
                    System.out.println("GAME OVER, 도전 가능 횟수를 모두 사용하였습니다.");
                    break; // 도전 가능 횟수 5회만에 맞추지 못하면, 게임 오버
                }
            }
        }
    }
}
