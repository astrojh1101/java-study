package chap07.ownexcode.inheritance;

public class Freshman extends CollegeStudent { //1학년 클래스 -> 대학생 클래스 상속

    Freshman(String name, String major, int adminYear, int studentId) {
        super(name, major, adminYear, studentId);
        // 대학생 클래스에 작성한 기본 생성자를 토대로, super()를 활용하면 부모 클래스의 기본 생성자 호출 가능

        //this.name = name;
        //this.major = major;
        //this.adminYear = adminYear;
        //this.studentId = studentId; // 부모 클래스에 기본 생성자 작성하지 않고, 자식 클래스에서 super() 활용하지 않으면 이렇게 작성하면 됨
    } //대학생 클래스에서 상속받은 필드

    void noticeFreshman() {
        System.out.println("1학년 학생입니다.");
    } //1학년 클래스에서 추가한 필드(1학년 학생임을 표시)
}
