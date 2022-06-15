package chap04;

public class Practice0413
{
    public static void main(String[] args)
    {
     String value = "12o34";
     char ch = ' ';
     boolean isNumber = true;

     // 반복문과 charAt(int i)를 이용해서 문자열의 문자를
        // 하나씩 읽어서 검사한다.
        for(int i=0; i <value.length() ; i++) {
            ch = value.charAt(i); // i번째 문자 반환
            if(!('0'<=ch && ch<='9')) { // ch가 숫자면 true이지만, !(논리부정) 붙였으므로, ch가 숫자가 아니어야 true
                isNumber = false; // 문자열이 숫자로 이루어져 있지 않을 경우 실행
                break;
            }
        }

        if (isNumber) {
            System.out.println(value+"는 숫자입니다.");
        } else {
            System.out.println(value+"는 숫자가 아닙니다.");
        }
    } // end of main
} // end of class
