package basic.ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("주문의 개수: ");
        int orderCount = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] orders = new ProductOrder[orderCount];
        for (int i = 0; i < orders.length; i++) {
            System.out.println((i + 1) + "번째 주문 정보");

            System.out.print("상품명 :");
            String productName = scanner.nextLine();

            System.out.print("가격 :");
            int productPrice = scanner.nextInt();

            System.out.print("수량 :");
            int productQuantity = scanner.nextInt();
            scanner.nextLine();

            orders[i] = createOrder(productName, productPrice, productQuantity);
        }

        printOrders(orders);

        int amount = getTotalAmount(orders);
        System.out.println("amount = " + amount);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;

        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println(order.productName + ", " + order.price + ", " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;

        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }

        return totalAmount;
    }
}
