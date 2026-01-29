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

    public void setCompany(String company) {
        this.company = company;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    private String company;
    private Engine engine;



    Car(String newCar, String company, String engineType){
        this.newCar = newCar;
        this.company = company;
        this.engine = new Engine(engineType);
    }

    public String getCompany() {
        return company;
    }
}
