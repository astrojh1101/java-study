package chap07.Exercise.Exercise0705;

public class Product {
    int price; // 제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스 점수

    Product() {} // 기본 생성자 추가

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price/10.0);
    }
}
