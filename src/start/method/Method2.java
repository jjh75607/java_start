package start.method;

public class Method2 {

    public static void main(String[] args) {
        printHeader();
        printFooter();
    }

    public static void printHeader() {
        System.out.println("start");
        return;
    }

    public static void printFooter() {
        System.out.println("end");
    }
}