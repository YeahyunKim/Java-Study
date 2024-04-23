package access.ex;

import java.util.Scanner;

public class ShoppingCart {
    Item[] items = new Item[10];
    private int itemsCount;

    public void addItem(Item item) {
        if (itemsCount >= items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
        } else {

            items[itemsCount] = item;
            itemsCount++;
        }
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        int totalPrice = 0;


        for (int i = 0; i < itemsCount; i++) {
            System.out.println("상품명 | " + items[i].getName());
            System.out.println("합계   | " + items[i].getPrice() * items[i].getQuantity());

            totalPrice += items[i].getPrice() * items[i].getQuantity();
        }

        System.out.println("전체 가격 합 | " + totalPrice );

    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemsCount; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }

}
