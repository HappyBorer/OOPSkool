package OOP.Task1.Cars;

public class Truck extends Car{
    private double carryingCapacity;

    public Truck(){}

    public Truck(String brand, String surnameOwner, double engineCapacity, int yearRelease, double carryingCapacity){
        super(brand, surnameOwner, engineCapacity, yearRelease);
        this.carryingCapacity = carryingCapacity;
    }

    public boolean ifCanCarry(double weight){
        return carryingCapacity >= weight;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "brand='" + super.getBrand() +"', owner='" + super.getSurnameOwner() + "', volume=" + super.getEngineCapacity() +
                ", yearOfMade=" + super.getYearRelease() + ", capacity=" + carryingCapacity +
                '}';
    }

    public double getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(double carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }
}
