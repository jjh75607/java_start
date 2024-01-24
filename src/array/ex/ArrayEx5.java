package array.ex;

import java.util.Scanner;

public class ArrayEx5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[] arr = new int[size];
        int sum = 0;

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        double avg = (double) sum / arr.length;

        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }
}
