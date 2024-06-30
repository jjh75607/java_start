package basic.poly.car1;

public class Driver {

    private Car car;


    public void setCar(Car car) {
        System.out.println("car = " + car);
        this.car = car;
    }

    public void driver() {
        System.out.println("Driver.driver");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }

}
