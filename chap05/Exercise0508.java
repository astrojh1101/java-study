package chap05;

public class Exercise0508 {
    public static void main(String[] args) {
        int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2}; // 1 3개, 2 2개, 3 2개, 4 4개
        int[] counter = new int[4];

        for(int i=0; i<answer.length; i++) { // 0~10
            counter[answer[i]-1]++; // 1~4까지의 데이터를 세지만 인덱스 값은 0부터 시작하므로(3까지) -1 적용
        }
        for(int i=0; i<counter.length; i++) { // 0~3
            System.out.print(counter[i]); // 몇개의 값을 가졌는지 표현하는 수 출력
            for(int j=0; j<counter[i]; j++){
                System.out.print("*"); // 10행 값으로 나온 수만큼 별 출력
            }
            System.out.println();
        }
    }  // end of main
}  // end of class
