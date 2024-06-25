package basic.extends1.access.parent;

public class Parent {

    public int publicValue;
    protected int protectedValue;
    int value;
    private int privateValue;

    public void publicMethod() {
        System.out.println("Parent.publicMethod");
    }

    protected void protectedMethod() {
        System.out.println("Parent.protectedMethod");
    }

    void defaultMethod() {
        System.out.println("Parent.defaultMethod");
    }

    private void privateMethod() {
        System.out.println("Parent.privateMethod");
    }

    public void printParent() {
        System.out.println("==Parent method ==");
        System.out.println("publicValue = " + publicValue);
        System.out.println("protectedValue = " + protectedValue);
        System.out.println("value = " + value);
        System.out.println("privateValue = " + privateValue);

        defaultMethod();
        privateMethod();
    }
}
