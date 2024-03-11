package OOP.Task1.EducationDepartment;

public class Student extends Learner{
    private String university;
    private String group;
    private static int baseScholarship;
    public Student(){}

    public Student(String surname, int gradeOne, int gradeTwo, String university, String group) {
        super(surname, gradeOne, gradeTwo);
        this.university = university;
        this.group = group;
    }

    public int calculateScholarship(){
        if(getAverageMark() >= 9){
            return (int)(baseScholarship * 1.6);
        }else if(getAverageMark() >= 8){
            return (int)(baseScholarship * 1.4);
        }else if(getAverageMark() >= 6){
            return (int)(baseScholarship * 1.2);
        }else if(getAverageMark() >= 5){
            return baseScholarship;
        }else{
            return 0;
        }
    }
    @Override
    public int getHolidays() {
        return 74;
    }

    @Override
    public String toString() {
        return super.toString() + ";" + university + ";" + group;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public static int getBaseScholarship() {
        return baseScholarship;
    }

    public static void setBaseScholarship(int baseScholarship) {
        Student.baseScholarship = baseScholarship;
    }
}
