package start.scanner;

import java.util.Scanner;

public class ScannerWhile3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.print(">>");
            int n = scanner.nextInt();

            if (n == 0) {
                break;
            }

            sum += n;
        }

        System.out.println("sum = " + sum);
        System.out.println("EXIT");
    }
}
