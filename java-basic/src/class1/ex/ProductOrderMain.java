package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder product1 = new ProductOrder();
        product1.productName = "맥북";
        product1.price = 3000000;
        product1.quantity = 2;

        ProductOrder product2 = new ProductOrder();
        product2.productName = "아이폰";
        product2.price = 1000000;
        product2.quantity = 5;

        ProductOrder product3 = new ProductOrder();
        product3.productName = "에어팟";
        product3.price = 400000;
        product3.quantity = 12;

        ProductOrder[] products = {product1, product2, product3};

        int totalAmount = 0;
        for (ProductOrder product : products) {
            System.out.println("상품명 : " + product.productName + " | 가격 : " + product.price + " | 주문 수량 : " + product.quantity);
            totalAmount += product.price * product.quantity;
            System.out.println(totalAmount + "원");
        }

    }
}
