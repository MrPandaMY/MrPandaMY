public class Exercise2 {
    public static void main(String[] args) {

      /*  Car car1 = new Car("Mustang", "Red");
        Car car2 = new Car("Corvette", "Blue");
        Car car3 = new Car("Charger", "Yellow"); */

        Car[] cars = {new Car("Mustang", "Red"), new Car("Corvette", "Blue"), new Car("Charger", "Yellow")};

        for (Car car : cars) {
            car.color = "Black";
        }

        for (Car car : cars) {
            car.drive();
        }
    }
}
