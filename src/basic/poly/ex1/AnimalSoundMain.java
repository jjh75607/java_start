package basic.poly.ex1;

public class AnimalSoundMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        System.out.println("test start");
        dog.sound();
        System.out.println("test finish");

        System.out.println("test start");
        cat.sound();
        System.out.println("test finish");


        System.out.println("test start");
        caw.sound();
        System.out.println("test finish");
    }
}
