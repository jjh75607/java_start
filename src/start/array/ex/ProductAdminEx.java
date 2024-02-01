package start.array.ex;

import java.util.Scanner;

public class ProductAdminEx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] productNames = new String[10];
        int[] productPrices = new int[10];
        int productCount = 0;

        while (true) {
            System.out.println("1. 상품등록 | 2. 상품목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요 : ");

            int option = scanner.nextInt();

            if (option == 1) {
                if (productCount == 10) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                } else {
                    scanner.nextLine();

                    System.out.print("name : ");
                    productNames[productCount] = scanner.nextLine();

                    System.out.print("price : ");
                    productPrices[productCount++] = scanner.nextInt();
                }
            } else if (option == 2) {
                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                } else {
                    for (int i = 0; i < productCount; i++) {
                        System.out.println(productNames[i] + ": " + productPrices[i] + "원");
                    }
                }
            } else if (option == 3) {
                break;
            } else {
                System.out.println("잘 못 된 메뉴 선택");
            }
        }
    }
}
