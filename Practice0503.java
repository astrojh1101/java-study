public class Practice0503 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int i = 0; i < 5; i++) { // 0~4
            sum += arr[i];
        }
        System.out.println("sum=" + sum);
    }
}
