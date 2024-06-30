package basic.poly.basic;

public class CastingMain6 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        call(parent1);

        Parent parent2 = new Child();
        call(parent2);
    }

    public static void call(Parent parent) {
        parent.parentMethod();

        if (parent instanceof Child child) {
            System.out.println("Child instance");
            child.childMethod();
        } else {
            System.out.println("no Child Instance");
        }
    }
}
