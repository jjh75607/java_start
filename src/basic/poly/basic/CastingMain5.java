package basic.poly.basic;

public class CastingMain5 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        call(parent1);

        Parent parent2 = new Child();
        call(parent2);
    }

    public static void call(Parent parent) {
        parent.parentMethod();

        if (parent instanceof Child) {
            System.out.println("Child instance");
            ((Child) parent).childMethod();
        } else {
            System.out.println("no Child Instance");
        }
    }
}
