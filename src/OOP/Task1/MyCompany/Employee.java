package OOP.Task1.MyCompany;

public class Employee {
    private String surname;
    private String sex;
    private int age, salary;
    Employee(){}
    public Employee(String surname, String sex, int age, int salary){
        this.surname = surname;
        this.sex = sex;
        this.age = age;
        if(isPensioner()) {
            this.salary = 90000;
        }else{
            this.salary = salary;
        }
    }
    public boolean isPensioner(){
        if(sex.equals("male")){
            return age > 63;
        }else {
            return age > 58;
        }
    }

    public void changeSalary(double koef){
        salary = (int)(salary * koef);
    }
    public void show(){
        System.out.printf("%s;%s;%d;%d\n", surname, sex, age, salary);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
