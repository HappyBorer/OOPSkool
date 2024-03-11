package OOP.Task1.EducationDepartment;

public abstract class Learner {
    private String surname;
    private int gradeOne;
    private int gradeTwo;

    Learner(){};
    Learner(String surname, int gradeOne, int gradeTwo){
        this.surname = surname;
        this.gradeOne = gradeOne;
        this.gradeTwo = gradeTwo;
    }

    public double getAverageMark(){
        return (gradeOne + gradeTwo) / 2.;
    }

    public abstract int getHolidays();

    @Override
    public String toString() {
        return surname + ";" + gradeOne + ";"+ gradeTwo;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getGradeOne() {
        return gradeOne;
    }

    public void setGradeOne(int gradeOne) {
        this.gradeOne = gradeOne;
    }

    public int getGradeTwo() {
        return gradeTwo;
    }

    public void setGradeTwo(int gradeTwo) {
        this.gradeTwo = gradeTwo;
    }
}
