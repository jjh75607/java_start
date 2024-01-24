package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(">>");
            String name = scanner.nextLine();

            if (name.equals("exit")) {
                System.out.println("exit");
                break;
            }

            System.out.print(">>");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.println(name + " : " + age);
        }
    }
}
