public class Car extends Vehicle{

    @Override
    void go() {
        System.out.println("Drive Car");
    }

    @Override
    void name(){
        System.out.println("You own an Alto");
    }

    private String newCar;

    public String getNewCar() {
        return newCar;
    }

    public void setNewCar(String newCar) {
        this.newCar = newCar;
    }

    private final String fuel = "Petrol"; // cannot be assigned anything else

    public String getFuel() {
        return fuel;
    }
}
