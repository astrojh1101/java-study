package chap05;

public class Practice0503 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int i = 0; i < 5; i++) { // 0~4
            sum += arr[i]; // arr[0]+arr[1]+arr[2]+arr[3]+arr[4] = 10+20+30+40+50 = 150
        }
        System.out.println("sum=" + sum);
    }
}
