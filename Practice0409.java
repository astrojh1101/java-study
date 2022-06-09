public class Practice0409 {
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;

        for(int i=0; i < str.length(); i++) {
            sum += str.charAt(i) - '0'; // charat(int)를 활용하여 문자를 숫자로 변환하여 sum에 더함 -> 49-48 + 50-48 + 51-48 + 52-48 + 53-48
        }
        System.out.println("sum="+sum);
    }
}
