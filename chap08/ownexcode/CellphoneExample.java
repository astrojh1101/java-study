package chap08.ownexcode;

public class CellphoneExample {
    public static void main(String[] args) {

        Cellphone cp = new Cellphone();

        Call cl = cp;
        Message mms = cp;
        Record rc = cp;
        // CellPhone클래스는 Call, Message, Record 인터페이스 구현 -> Cellphone객체를 3개의 인터페이스 타입 변수에 대입할 수 있음

        cp.sendCall();
        cp.receiveCall();

        cp.sendMessage();
        cp.receiveMessage();

        cp.onRecord();
        cp.pauseRecord();
        cp.offRecord();
        }
    }
