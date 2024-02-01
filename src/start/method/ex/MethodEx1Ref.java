package start.method.ex;

public class MethodEx1Ref {

    public static void main(String[] args) {
        System.out.println("avg = " + average(1, 2, 3));
        System.out.println("avg = " + average(15, 25, 35));
    }

    public static double average(int n1, int n2, int n3) {
        return (n1 + n2 + n3) / 3.0;
    }
}
