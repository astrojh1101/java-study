public class Exercise0508 {
    public static void main(String[] args) {
        int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
        int[] counter = new int[4];

        for(int i=0; i<answer.length; i++) {
            counter[answer[i]-1]++; // 1~4까지의 데이터를 세지만 인덱스 값은 0부터 시작하므로(3까지) -1 적용
        }
        for(int i=0; i<counter.length; i++) {
            System.out.print(counter[i]);
            for(int j=0; j<counter[i]; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }  // end of main
}  // end of class
