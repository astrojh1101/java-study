public class Practice0404 {
    public static void main(String[] args) {
        int sum = 0; //
        int j = 1; // 값의 부호를 바꿔주는데 사용할 변수(6행)
        int num = 0;
        for(int i=1;; i++, j=-j) { // 1, -1, 1, -1 ... 계속 반복
            num = j * i; // 1 * 1 + -1 * 2 + 1 * 3 ...
            sum += num; // 앞 변수에 뒤의 값 더하면서 총합 저장
            if(sum >=100) // 총합이 100 이상 되면 반복문 종료
                break;
        }
        System.out.println(+num);
    }
}
