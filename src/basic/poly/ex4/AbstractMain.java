package basic.poly.ex4;

public class AbstractMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        cat.sound();
        cat.move();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);

        moveAnimal(dog);
        moveAnimal(cat);
        moveAnimal(caw);

    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("test start");
        animal.sound();
        System.out.println("test finish");
    }

    private static void moveAnimal(AbstractAnimal animal) {
        System.out.println("test start");
        animal.move();
        System.out.println("test finish");
    }
}
