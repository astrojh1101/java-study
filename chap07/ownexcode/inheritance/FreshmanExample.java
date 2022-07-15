package chap07.ownexcode.inheritance;

public class FreshmanExample {
    public static void main(String[] args) {

        Freshman freshman = new Freshman("이준호", "경영정보학부", 2018, 20182874);

        System.out.println("성명: "+freshman.name);
        System.out.println("전공: "+freshman.major);
        System.out.println("입학연도: "+freshman.adminYear);
        System.out.println("학번: "+freshman.studentId); //대학생 클래스에서 상속받은 메소드를 호출

        freshman.noticeFreshman(); //1학년 클래스의 메소드 호출
    }
}
