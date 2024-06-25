package basic.static2.ex;

public class Car {

    private String name;
    private static int count;

    public Car(String name) {
        this.name = name;
        count++;

        System.out.println("name : " + this.name);
    }

    public static void showTotalCars() {
        System.out.println(count);
    }
}
