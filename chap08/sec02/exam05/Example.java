package chap08.sec02.exam05;

public class Example {
    public static void main(String[] args) {

        ImplementationC impl = new ImplementationC();

        InterfaceA ia = impl;
        ia.methodA();

        InterfaceB ib = impl;
        ib.methodB();

        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
