package OOP.Task1.Cars;

import java.util.Calendar;

public class Car {
    private String brand;
    private String surnameOwner;
    private double engineCapacity;
    private int yearRelease;

    private static int thisYear;

    {
        Calendar calendar = Calendar.getInstance();
        thisYear = calendar.get(Calendar.YEAR);
    }
    public Car(){

    }
    public Car(String brand, String surnameOwner, double engineCapacity, int yearRelease){
        this.brand = brand;
        this.surnameOwner = surnameOwner;
        this.engineCapacity = engineCapacity;
        this.yearRelease = yearRelease;
    }

    public int getLife(){
        return thisYear - yearRelease;
    }
    public String toString(){
        return String.format("Car{brand='%s', owner='%s', volume=%.1f, yearOfMade=%d}", brand, surnameOwner,
                engineCapacity, yearRelease);
    }
    public static int getThisYear() {
        return thisYear;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSurnameOwner() {
        return surnameOwner;
    }

    public void setSurnameOwner(String surnameOwner) {
        this.surnameOwner = surnameOwner;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }
}
