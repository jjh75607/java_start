package start.scanner.ex;

import java.util.Scanner;

public class ScannerEx1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(">>");
        String name = scanner.nextLine();

        System.out.print(">>");
        int age = scanner.nextInt();

        System.out.println(name + " : " + age);
    }
}
