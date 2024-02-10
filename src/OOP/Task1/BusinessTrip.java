package OOP.Task1;

public class BusinessTrip {
    static final int DAILY = 25;
    String name, surname;
    int fare;
    int amountOfDays;

    BusinessTrip(){

    }
    BusinessTrip(String surname, String name, int amountOfDays, int fare){
        this.surname = surname;
        this.name = name;
        this.amountOfDays = amountOfDays;
        this.fare = fare;
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

}
