package Cond;

public class If5 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        }
        if (age <= 10) {
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        }

        // 이 할인 시스템의 핵심은 **한 사용자가 동시에 여러 할인을 받을 수 있다는 점**이다.
        System.out.println("총 할인 금액: " + discount + "원");
    }
}
