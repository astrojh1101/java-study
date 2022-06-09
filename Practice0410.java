public class Practice0410 {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;
        while(num > 0) {
            sum += num%10;
            num /= 10; // 6열, 7열 -> 12345%10=5 + 1234%10=4 + 123%10=3 + 12%10=2 + 1%10=1
        }
        System.out.println("sum="+sum);
    }
}
