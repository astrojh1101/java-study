public class Practice0402 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1; i<=20; i++) {
            if(i%2!=0 && i%3!=0) // 2 '또는(&&)' 3의 배수가 아닌(!=)
                sum +=i;
        }
        System.out.println("sum=" +sum);
    }
}
