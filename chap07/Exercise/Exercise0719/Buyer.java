package chap07.Exercise.Exercise0719;

public class Buyer {
    int money = 10000;
    Product[] cart = new Product[3]; // 구입한 제품을 저장하기 위한 배열
    int i = 0; // Product배열 cart에 사용될 index

    void buy(Product p) {

        if(money < p.price) {
            System.out.println("잔액이 부족하여"+p+"을/를 살 수 없습니다."); // 1.1 가진 돈이 적으면 메소드 종료
            return;
        } else {
            money -= p.price; // 1.2 가진 돈이 충분하면, 제품의 가격을 가진 돈에서 빼고
            add(p); // 1.3 장바구니에 구입한 물건을 담는다. (add메서드 호출)
        }

    }

    void add(Product p) {

        if(i >= cart.length) { // 1.1 i의 값이 장바구니의 크기보다 같거나 크면
            Product[] tmp = new Product[cart.length*2]; // 1.1.1 기존의 장바구니보다 2배 큰 새로운 배열 생성
            System.arraycopy(cart, 0, tmp, 0, cart.length); // 1.1.2 기존의 장바구니의 내용을 새로운 배열에 복사
            cart = tmp; // 1.1.3 새로운 장바구니와 기존의 장바구니를 교체
        }
    cart[i++]=p; // 1.2 물건을 장바구니에 저장, i의 값 1 증가시킴
    }

    void summary() {

        String inCartList = null;
        int sum = 0;
        for(int i=0; i<cart.length; i++) {
            if(cart[i]==null)
                break; // 1.1 장바구니에 담긴 물건들의 목록을 만들어 출력
            inCartList += cart[i] + ",";
            sum += cart[i].price; // 1.2 장바구니에 담긴 물건들의 가격을 모두 더해 출력

            System.out.println("구입한 물건 : "+inCartList);
            System.out.println("사용한 금액 : "+sum);
            System.out.println("남은 금액 : "+money); //1.3 물건을 사고 남은 금액(money)을 출력
        }
    }
}
