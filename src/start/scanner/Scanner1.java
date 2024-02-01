package start.scanner;

import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(">>");
        String str = scanner.nextLine();
        System.out.println("str = " + str);

        System.out.print(">>");
        int intValue = scanner.nextInt();
        System.out.println("intValue = " + intValue);

        System.out.print(">>");
        double doubleValue = scanner.nextDouble();
        System.out.println("doubleValue = " + doubleValue);

    }
}
