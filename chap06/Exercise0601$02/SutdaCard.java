package chap06.Exercise0601$02;

public class SutdaCard {
    int num;
    boolean isKwang;

    public SutdaCard(){
        this(1,true);
    }

    public SutdaCard(int num, boolean isKwang){
        this.num=num;
        this.isKwang=isKwang;
    }
    public String info(){
        return num + (isKwang ? "K" : "");
    }
}
