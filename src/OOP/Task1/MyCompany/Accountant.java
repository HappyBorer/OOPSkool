package OOP.Task1.MyCompany;

public class Accountant extends Employee{
    private char gruppa;
    Accountant(){

    }

    public Accountant(String surname, String sex, int age, int salary, char gruppa) {
        super(surname, sex, age, salary);
        this.gruppa = gruppa;
    }
    public void show(){
        System.out.printf("%s;%s;%d;%d;%c\n", getSurname(), getSex(), getAge(), getSalary(), gruppa);
    }

    public char getGruppa() {
        return gruppa;
    }

    public void setGruppa(char gruppa) {
        this.gruppa = gruppa;
    }
}
