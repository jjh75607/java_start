package start.scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            int n = scanner.nextInt();

            if (n == -1) {
                break;
            }

            sum += n;
            count++;
        }

        System.out.println("sum = " + sum);

        double average = (double) sum / count;
        System.out.println("average = " + average);
    }
}
