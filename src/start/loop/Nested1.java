package start.loop;

public class Nested1 {

    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            System.out.println("외부 for 시작");

            for (int j = 0; j < 3; j++) {
                System.out.println("내부 for문");
            }
        }
    }
}
