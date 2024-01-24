package scanner;

import java.util.Scanner;

public class ScannerWhile2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(">>");
            int n1 = scanner.nextInt();

            System.out.print(">>");
            int n2 = scanner.nextInt();

            if (n1 == 0 && n2 == 0) {
                System.out.println("EXIT");
                break;
            }

            int sum = n1 + n2;
            System.out.println("sum = " + sum);
        }
    }
}
