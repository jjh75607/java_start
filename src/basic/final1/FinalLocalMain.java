package basic.final1;

public class FinalLocalMain {

    public static void main(String[] args) {
        final int data1;
        data1 = 10;
//        data1 = 20;

        final int data2 = 10;
        method(data2);
    }

    static void method(final int parameter) {
//        parameter = 201;
    }
}
