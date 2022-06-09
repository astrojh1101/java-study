public class Practice0403 {
    public static void main(String[] args) {
        int sum = 0;
        int allsum = 0;
        for (int i=1; i<=10; i++) {
            sum += i;
            allsum += sum; // 문제와 같이 1+(1+2)... 식으로 합해나가려면 sum값을 누적해서 더해야함
        }
        System.out.println(+allsum);
    }
}
