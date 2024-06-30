package basic.poly.overriding;

public class OverridingMain {

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println("child -> Child");
        System.out.println("childㄹ .value = " + child.value);
        child.method();

        Parent parent = new Parent();
        System.out.println("parent -> Parent");
        System.out.println("parent.value = " + parent.value);
        parent.method();

        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("poly.value = " + poly.value);
        poly.method();
    }
}
