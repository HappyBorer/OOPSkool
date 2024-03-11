package OOP.Task1.EducationDepartment;

public class Schoolboy extends Learner{
    private String school;
    private String classSchool;
    public Schoolboy(){}
    public Schoolboy(String surname, int gradeOne, int gradeTwo, String school, String classSchool){
        super(surname, gradeOne, gradeTwo);
        this.school = school;
        this.classSchool = classSchool;
    }
    @Override
    public int getHolidays() {
        return 124;
    }

    @Override
    public String toString() {
        return super.toString() + ";" + school + ";" + classSchool;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getClassSchool() {
        return classSchool;
    }

    public void setClassSchool(String classSchool) {
        this.classSchool = classSchool;
    }
}
