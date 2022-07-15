package chap07.ownexcode.typeconvert;

public class InstanceOfABC {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C(); // C -> B -> A 상속 관계

        //좌항(객체) instanceof 우항(타입) : 좌항의 객체가 우항의 인스턴스이면 true, 아니면 false 도출

        System.out.println(a instanceof A); //true
        System.out.println(a instanceof B); //false
        System.out.println(a instanceof C); //false

        System.out.println(b instanceof A); //true
        System.out.println(b instanceof B); //true
        System.out.println(b instanceof C); //false

        System.out.println(c instanceof A); //true
        System.out.println(c instanceof B); //true
        System.out.println(c instanceof C); //true
    }

}