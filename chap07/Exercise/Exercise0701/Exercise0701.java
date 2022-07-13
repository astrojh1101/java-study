package chap07.Exercise.Exercise0701;

public class Exercise0701 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        for(int i=0; i< deck.cards.length; i++)
            System.out.print(deck.cards[i]+",");
    }
}
