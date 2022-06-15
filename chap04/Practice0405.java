package chap04;

public class Practice0405 {
    public static void main(String[] args) {
        int i=0;
        while(i<=10) {
            int j=0;
            while(j<=i) {
                System.out.print("*");
                j++; // while문 변환 전 for문 당시 *출력에 관한건 변수 j로 j++이 들어감
            }
            System.out.println();
            i++; // 8행 j++와 바뀔경우 *이 무한정 실행됨
        }
    } // end of main
} // end of class