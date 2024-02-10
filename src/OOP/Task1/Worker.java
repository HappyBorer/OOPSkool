package OOP.Task1;

public class Worker implements Person{
    private String surname, name, secondName, telephone;

    private  String status = "worker";
    private int  yearOfBirth;

    Worker(){
        telephone = "+7-000-000-00-00";
    }
    Worker(String surname, String name, String secondName, int yearOfBirth, String telephone){
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.yearOfBirth = yearOfBirth;
        if(isCorrectPhone(telephone)) {
            this.telephone ="+7" + telephone;
        }else{
            this.telephone = "+7-000-000-00-00";
        }
    }

    @Override
    public void getInfo() {
        System.out.printf("""
                Surname: %s
                Name: %s
                Second name: %s
                Year of birth: %d
                Telephone: %s
                Status: %s
                """, surname, name, secondName, yearOfBirth, telephone, status);
    }

    @Override
    public String getStatus() {
        return status;
    }
    @Override
    public void getName() {
        System.out.printf("""
                Surname: %s
                Name: %S
                Second name: %s
                """, surname, name, secondName);
    }
    public boolean isCorrectPhone(String telephone){
        if(telephone.length() != 10){
            return false;
        }
        for (int i = 0; i < telephone.length(); i++) {
            if(!Character.isDigit(telephone.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }



    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
