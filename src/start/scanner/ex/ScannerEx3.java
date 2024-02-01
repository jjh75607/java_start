package start.scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(">>");
        String foodName = scanner.nextLine();

        System.out.print(">>");
        int foodPrice = scanner.nextInt();

        System.out.print(">>");
        int foodQuantity = scanner.nextInt();

        int totalPrice = foodPrice * foodQuantity;
        System.out.println(foodName + foodQuantity + " : " + totalPrice);
    }
}
