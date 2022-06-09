public class Practice0408 {
    public static void main(String[] args) {
        for (int x=0; x<=10; x++) {
            for (int y=0; y<=10; y++) {
                if((2*x + 4*y) == 10) {
                    System.out.println("x="+x+ ", y="+y); // 2x+4y=10을 만족시키는 해가 나왔을때 출력됨
                }
            }
        }

    }
}
