package chap07.ownexcode.inheritance;

public class collegestudent { //대학생 클래스
    String name;
    String major;
    int adminyear;
    int studentid;

    public collegestudent(String name, String major, int adminyear, int studentid) {
        this.name = name;
        this.major = major;
        this.adminyear = adminyear;
        this.studentid = studentid;
    } // 자식 클래스에서 부모 클래스의 기본 생성자를 호출하는 super()를 사용할 수 있도록 하기 위해 작성

    void showname() {
        System.out.println("성명을 표시합니다.");
    }
    void showmajor() {
        System.out.println("전공을 표시합니다.");
    }
    void showadminyear() {
        System.out.println("입학년도를 표시합니다.");
    }
    void showstudentid() {
        System.out.println("학번을 표시합니다.");
    }
}
