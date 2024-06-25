package basic.final1;

public class FinalFieldMain {

    public static void main(String[] args) {
        ConstructInit c1 = new ConstructInit(10);
        ConstructInit c2 = new ConstructInit(20);

        System.out.println(c1.value);
        System.out.println(c2.value);

        FieldInit f1 = new FieldInit();
        FieldInit f2 = new FieldInit();
        FieldInit f3 = new FieldInit();
        System.out.println(f1.value);
        System.out.println(f2.value);
        System.out.println(f3.value);

        System.out.println(FieldInit.CONST_VALUE);
    }
}
