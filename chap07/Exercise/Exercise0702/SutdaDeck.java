package chap07.Exercise.Exercise0702;

public class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for(int i=0; i<CARD_NUM; i++) {
            if(i==0 || i==2 || i==7) {
                cards[i] = new SutdaCard(i+1, true);
            } else {
                cards[i] = new SutdaCard(i%10 +1, false);
            }
        }
    }

    void shuffle() {
        int idx = 0;
        SutdaCard tmp;
        for(int i=0; i<CARD_NUM; i++) {
            idx = (int) Math.random() % CARD_NUM;
            tmp = cards[idx];
            cards[idx] = cards[i];
            cards[i] = tmp;
        }
    }

    SutdaCard pick(int index) {
        if(index < 0 || index > CARD_NUM)
            return null;
        return cards[index];
    }

    SutdaCard pick() {
        int idx = (int) Math.random() % CARD_NUM;
        return cards[idx];
    }
}
