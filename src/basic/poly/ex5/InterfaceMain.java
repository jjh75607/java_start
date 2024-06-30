package basic.poly.ex5;

public class InterfaceMain {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Caw caw = new Caw();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }

    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("test start");
        animal.sound();
        System.out.println("test finish");
    }
}
