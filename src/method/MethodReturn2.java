package method;

public class MethodReturn2 {

    public static void main(String[] args) {
        checkAge(10);
        checkAge(20);
    }

    public static void checkAge(int age) {
        if (age < 10) {
            System.out.println("미성년자");
        }
        System.out.println("입장");
    }
}
