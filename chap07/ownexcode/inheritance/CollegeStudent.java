package chap07.ownexcode.inheritance;

public class CollegeStudent { //대학생 클래스
    String name;
    String major;
    int adminYear;
    int studentId;

    public CollegeStudent(String name, String major, int adminYear, int studentId) {
        this.name = name;
        this.major = major;
        this.adminYear = adminYear;
        this.studentId = studentId;
    } // 자식 클래스에서 부모 클래스의 기본 생성자를 호출하는 super()를 사용할 수 있도록 하기 위해 작성

    void showName() {
        System.out.println("성명을 표시합니다.");
    }
    void showMajor() {
        System.out.println("전공을 표시합니다.");
    }
    void showAdminYear() {
        System.out.println("입학년도를 표시합니다.");
    }
    void showStudentId() {
        System.out.println("학번을 표시합니다.");
    }
}
