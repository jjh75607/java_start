package start.scanner;

import java.util.Scanner;

public class ScannerWhile1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(">>");
            String str = scanner.nextLine();

            if (str.equals("exit")) {
                System.out.println("EXIT");
                break;
            }

            System.out.println("str = " + str);
        }
    }
}
