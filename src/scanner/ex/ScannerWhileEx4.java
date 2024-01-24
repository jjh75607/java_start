package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPrice = 0;

        while (true) {
            System.out.println("1. 입력, 2. 결제, 3. 종료");

            int option = scanner.nextInt();

            if (option == 1) {
                scanner.nextLine();

                System.out.print(">>");
                String product = scanner.nextLine();

                System.out.print(">>");
                int price = scanner.nextInt();

                System.out.print(">>");
                int quantity = scanner.nextInt();

                totalPrice += price * quantity;
                System.out.println(product + " : " + price + " : " + quantity + " : " + price * quantity);

            } else if (option == 2) {
                System.out.println(totalPrice);
                totalPrice = 0;
            } else if (option == 3) {
                System.out.println("exit");
                break;
            } else {
                System.out.println("다시");
            }
        }
    }
}
