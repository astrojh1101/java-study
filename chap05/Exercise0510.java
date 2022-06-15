package chap05;

public class Exercise0510 {
    public static void main(String[] args) {
        char[] abcCode =
                {'`', '~', '!', '@', '#', '$', '%', '^', '&', '*',
                 '(', ')', '-', '_', '+', '=', '|', '[', ']', '{',
                 '}', ';', ':', ',', '.', '/'};
                        // 0    1    2    3    4    5    6    7    8    9
        char[] numCode = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};

        String src = "abc123";
        String result = "";

        // 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
        for(int i=0; i<src.length(); i++) {
            char ch = src.charAt(i);
            if('a' <= ch && ch <='z') {
                result += abcCode[ch-'a']; // abcCode['a'-'a'=0]+abcCode['b'-'a'=98-97=1]+abcCode['c'-'a'=99-97=2] -> '~!
            } else if('0' <= ch && ch <='9') {
                result += numCode[ch-'0']; // numCode['1'-'0'=49-48=1]+numCode['2'-'0'=50-48=2]+numCode['3'-'0'=51-48=3] -> wer
            }
        }

        System.out.println("src:"+src);
        System.out.println("result:"+result);

    } // end of main
} // end of class
