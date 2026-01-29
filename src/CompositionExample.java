public class CompositionExample {
    // Composition represents a "part-of" relation between objects
    // Engine is a "part-of" a car
    // Allows complex objects to be constructed from the objects


    public static void main(String[] args) {

        Car car =new Car("Giulia","Alfa Romeo","V6");

        System.out.println("Car name: "+ car.getNewCar() +
                           "Car Make: "+ car.getCompany() +
                           "Car engine Type: "+ car.getEngine().getType());
    }
}
