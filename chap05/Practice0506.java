package chap05;

public class Practice0506 {
    public static void main(String[] args) {
        // 큰 금액의 동전을 우선적으로 거슬러 저야한다.
        int[] coinUnit = {500, 100, 50, 10};
                        // [0], [1], [2], [3]
        int money = 2680;
        System.out.println("money="+money);

        for(int i=0; i<coinUnit.length;i++) { //coinunit.length는 4, 0<=i<4이므로 0~3까지

            System.out.println(coinUnit[i]+"원: "+money/coinUnit[i]); // 2680/500=5, 180/100=1, 80/50=1, 30/10=3
            money = money%coinUnit[i]; // 2680%500=180, 180%100=80, 80%50=30, 30%10=0
        }
    }
}
