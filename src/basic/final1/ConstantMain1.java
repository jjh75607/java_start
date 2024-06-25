package basic.final1;

public class ConstantMain1 {

    public static void main(String[] args) {
        System.out.println("1000");
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }

    private static void process(int currentUserCount) {
        if (currentUserCount > Constant.MAX_USERS) {
            System.out.println("waiting");
        } else {
            System.out.println("go");
        }
    }
}
