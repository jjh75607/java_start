package basic.memory;

public class JavaMemoryMain1 {

    public static void main(String[] args) {
        System.out.println("main start");
        method1(10);
        System.out.println("main end");
    }

    static void method1(int n1) {
        System.out.println("method1 start");
        int cal = n1 * 2;
        method2(cal);
        System.out.println("method1 end");
    }

    static void method2(int n1) {
        System.out.println("method2 start");

        System.out.println("method2 end");
    }
}
