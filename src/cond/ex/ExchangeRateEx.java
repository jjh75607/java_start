package cond.ex;

public class ExchangeRateEx {

    public static void main(String[] args) {
        int dollar = 10;

        if(dollar < 0) {
            System.out.println("잘못");
        } else if (dollar == 0) {
            System.out.println("X");
        } else {
            int won = dollar * 1300;
            System.out.println(won);
        }
    }
}
