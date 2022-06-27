package chap06.iphonemake;

public class IPhone13Manufacture {
    public static void main(String[] args) {
        IPhone13 IPhone13Pro1 = new IPhone13("Apple", "IPhone13Pro", 1234, 6.1);
        IPhone13 IPhone13Pro2 = new IPhone13("Apple", "IPhone13Pro", 1234, 6.1);

        System.out.println(IPhone13Pro1 == IPhone13Pro2);
    }
}