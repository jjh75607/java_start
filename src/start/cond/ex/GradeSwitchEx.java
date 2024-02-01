package start.cond.ex;

public class GradeSwitchEx {

    public static void main(String[] args) {
        String grade = "Z";

        switch (grade) {
            case "A" -> System.out.println("A");
            case "B" -> System.out.println("B");
            case "C" -> System.out.println("C");
            case "D" -> System.out.println("D");
            case "F" -> System.out.println("F");
            default -> System.out.println("XX");
        }
    }
}
