package Cond;

public class If6 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        } else if (age <= 10) {
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        } else {
            System.out.println("할인 없음");
        }
        // 첫 번째로 충족되는 조건인 1000원 할인만 적용되고, `if` 문을 빠져나온다. 따라서 사용자는 나머지 할인을 놓치게 된다.
        System.out.println("총 할인 금액: " + discount + "원");
    }
}
