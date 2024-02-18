package OOP.Task1;

import java.util.Objects;

public class BusinessTrip {
    private static final int DAILY = 25;
    private String name, surname;
    private int fare;
    private int amountOfDays;

    BusinessTrip(){

    }
    BusinessTrip(String surname, int amountOfDays, int fare){
        this.surname = surname;
        this.amountOfDays = amountOfDays;
        this.fare = fare;
    }
    BusinessTrip(String surname, String name, int amountOfDays, int fare){
        this.surname = surname;
        this.name = name;
        this.amountOfDays = amountOfDays;
        this.fare = fare;
    }
    BusinessTrip(Object clone){
        if(clone instanceof BusinessTrip tmp){
            this.surname = tmp.getSurname();
            this.name = tmp.getName();
            this.amountOfDays = tmp.getAmountOfDays();
            this.fare = tmp.getFare();
        }
    }

    public int getTotal(){
        return amountOfDays * DAILY + fare;
    }

    public void show(){
        System.out.printf("""
                Суточные = %d
                Фамилия Имя = %s %s
                Транспортные расходы = %d
                Количество дней = %d
                Итого расходы = %d
                """, DAILY, surname, name, fare, amountOfDays, getTotal());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BusinessTrip that = (BusinessTrip) o;
        return getTotal() == that.getTotal();
    }

    @Override
    public int hashCode() {
        int result = surname.hashCode();
        int c = name.hashCode();
        return 31 * result + c;
    }
    public String toString(){
        return String.format("%s;%d;%d;%d", surname, fare, amountOfDays, getTotal());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public int getAmountOfDays() {
        return amountOfDays;
    }

    public void setAmountOfDays(int amountOfDays) {
        this.amountOfDays = amountOfDays;
    }
}
