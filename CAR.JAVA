package car;
public class Car {
    private String model;
    private String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public void start() {
        System.out.println("Car started");
    }

    public void stop() {
        System.out.println("Car stopped");
    }

    public static void main(String[] args) {

        Car car1 = new Car("Tesla", "Red");
        car1.start();

        Car car2 = new Car("BMW", "Black");
        car2.start();

        Car car3 = new Car("", "Blue");
        car3.start();

        Car car4 = new Car("Audi", "White");
       
        Car car5 = new Car("Ford", "Grey");
        car5.stop();
    }
}
