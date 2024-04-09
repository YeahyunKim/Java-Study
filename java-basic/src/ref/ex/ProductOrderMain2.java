package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder product1 = createOrder("맥북", 3000000, 2);
        ProductOrder product2 = createOrder("아이폰", 1000000, 5);
        ProductOrder product3 = createOrder("에어팟", 400000, 12);

        ProductOrder[] orders = {product1, product2, product3};

        printOrders(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액 = " + totalAmount);
    }
    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder orderInfo = new ProductOrder();
        orderInfo.productName = productName;
        orderInfo.price = price;
        orderInfo.quantity = quantity;
        return orderInfo;
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명 : " + order.productName + " | 가격 : " + order.productName + " | 주문수량 : " + order.quantity);
        }
    }

    //ProductOrderMain 을 리펙토링 해보자.

}
