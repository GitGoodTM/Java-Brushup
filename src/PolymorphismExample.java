import java.util.Scanner;

public class PolymorphismExample {
    public static void main(String[] args){
        // Polymorphism is a feature of Java where an object can identify as other objects
        // Objects of a subclass can be treated as objects of a common superclass
        // will work on Interfaces as well

        Car car = new Car("Alto","Suzuki","i4");
        Bike bike = new Bike();

        //Car[] cars = {car,bike};
        //Bike[] bikes = {car,bike}; // both are mot possible

        Vehicle[] vehicles = {car,bike};

        for(Vehicle vehicle : vehicles){
            vehicle.go();
        }

        // below is a similar example for Runtime Polymorphism
        // we can let the user decide which child class to use
        // the method that gets executed is selected during runtime

        Scanner scanner = new Scanner(System.in);
        Vehicle vehicle;
        String type;

        System.out.print("Enter Vehicle type: ");
        type=(scanner.nextLine()).toLowerCase();

        if(type.equals("car")){
            String name;
            String company;
            String engineType;
            System.out.println("Enter new car details:");
            System.out.print("Name: ");
            name=scanner.nextLine();
            System.out.print("Make: ");
            company=scanner.nextLine();
            System.out.println("Type of Engine");
            engineType=scanner.nextLine();


            vehicle = new Car(name,company,engineType);
            vehicle.name();
        }else if (type.equals("bike")){
            vehicle = new Bike();
            vehicle.name();
        }else {
            System.out.println("Invalid input");
        }

        System.out.print("Add name of new Car: ");
        car.setNewCar(scanner.nextLine());
        System.out.println("Your new car is an "+ car.getNewCar());
    }
}
