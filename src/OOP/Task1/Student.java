package OOP.Task1;

public class Student {
    String name, username = "unknown";
    int age, curriculum;
    double balance, studentBeauty;

    Student() {
        name = "no_name";
        username = "unknown";
        age = 16;
        curriculum =  1;
        balance = 1000;
    }
    Student (String name, String username, int age, int curriculum, double balance, double studentBeauty){
        this.name = name;
        this.username = username;
        this.age = age;
        this.curriculum = curriculum;
        this.balance = balance;
        this.studentBeauty = studentBeauty;
    }

    public String getBalance(){
        if(balance >= 0){
            return String.format("баланс: %.2f руб.", balance);
        }else{
            return "Задолженность!";
        }
    }

}
