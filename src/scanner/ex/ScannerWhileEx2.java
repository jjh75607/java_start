package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(">>");
            int quantity = scanner.nextInt();

            if (quantity == -1) {
                System.out.println("Exit");
                break;
            }

            System.out.print(">>");
            int price = scanner.nextInt();

            int totalPrice = quantity * price;
            System.out.println("totalPrice = " + totalPrice);
        }
    }
}
