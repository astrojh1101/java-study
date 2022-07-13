package chap07.Exercise.Exercise0714;

public class SutdaCard {
    final int num;
    final boolean isKwang; // 한번 값이 지정되면 변경되어서는 안됨 : final 사용

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + ( isKwang ? "K" : "");
    }
}
