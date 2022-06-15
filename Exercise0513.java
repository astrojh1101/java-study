import java.util.Scanner;

class Exercise0513 {
    public static void main(String[] args) {
        String[] words = { "television", "computer", "mouse", "phone"};

        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<words.length; i++) {
            char[] question = words[i].toCharArray(); // String을 char[]로 변환

            for(int j=0; j<question.length; j++) {
                int a = (int)(Math.random() * question.length);
                char tmp;
                tmp = question[i];
                question[i] = question[a];
                question[a] = tmp; // 원래 문자의 위치를 임의로 바꾸기 위해 변수에 담긴 값 교환하는 tmp 변수 활용
            }

            System.out.printf("Q%d. %s의 정답을 입력하세요.>",
                                                i+1, new String(question));
            String answer = scanner.nextLine(); // enter 치기 전까지 쓴 문자열 모두 리턴

            // trim()으로 answer의 좌우 공백을 제거한 후, equals로 word[i]와 비교
            if(words[i].equals(answer.trim()))
                System.out.printf("맞았습니다.%n%n");
            else
                System.out.printf("틀렸습니다.%n%n");
        }
    } // main의 끝끝
}
