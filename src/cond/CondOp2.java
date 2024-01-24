package cond;

public class CondOp2 {

    public static void main(String[] args) {
        int age = 10;
        String status = (age >= 10) ? "성인" : "미성년지";

        System.out.println("status = " + status);
    }
}
