package chap06.iphonemake;

public class IPhone13Manufacture {
    public static void main(String[] args) {
        IPhone13 IPhone13Pro1 = new IPhone13("Apple", "IPhone13Pro", 1234, 6.1);
        IPhone13 IPhone13Pro2 = new IPhone13("Apple", "IPhone13Pro", 1234, 6.1);

        System.out.println(IPhone13Pro1 == IPhone13Pro2);
    }
}

// 현재 코드와 같이 비교연산자 == 를 활용해서 두 객체가 같은지 비교하게 되면 같지 않다는 false가 출력되게 된다.
// 그 이유는 IPhone13Pro1과 IPhone13Pro2는 객체가 아닌 객체를 가리키는 레퍼런스를 가지고 있기 때문이다.
// "값"을 이용해서 객체를 비교하려면 클래스 내부에 equal이라는 메소드를 재정의해야 한다.