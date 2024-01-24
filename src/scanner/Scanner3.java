package scanner;

import java.util.Scanner;

public class Scanner3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(">>");
        int num1 = scanner.nextInt();

        System.out.println(">>");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("num1 = " + num1);
        } else if (num2 > num1) {
            System.out.println("num2 = " + num2);
        } else {
            System.out.println("같음");
        }
    }
}
