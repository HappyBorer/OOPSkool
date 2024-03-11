package OOP.Task1.MyCompany;

public class Programmer extends Employee{
    private String status;
    private String specialization;

    Programmer(){}

    public Programmer(String surname, String sex, int age, int salary, String status) {
        super(surname, sex, age, salary);
        this.status = status;
    }

    public Programmer(String surname, String sex, int age, int salary, String status, String specialization) {
        super(surname, sex, age, salary);
        this.status = status;
        this.specialization = specialization;
    }
    public void show(){
        System.out.printf("%s;%s;%d;%d;%s\n", getSurname(), getSex(), getAge(), getSalary(), status);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
