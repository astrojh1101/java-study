public class Practice0411 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 1;
        int num3 = 0;
        System.out.println(num1+", "+num2);
        for(int i=0; i<8; i++) {
            num3=num1+num2; // 3번째 값 = 1번째 값 + 2번째 값
            System.out.println(num3); // 3번째 값 출력함
            num1=num2; // 2번째 수열 -> 1번째 값으로
            num2=num3; // 3번째 수열 -> 2번째 값으로
        }
    }
}
