package chap08.sec02.exam05;

public class ImplementationC implements InterfaceC {
    @Override
    public void methodA() {
        System.out.println("ImpelmentationC-methodA() 실행");
    }

    @Override
    public void methodB() {
        System.out.println("ImpelmentationC-methodB() 실행");
    }

    @Override
    public void methodC() {
        System.out.println("ImpelmentationC-methodC() 실행");
    }
}
