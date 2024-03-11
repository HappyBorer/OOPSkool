package OOP.Task1;

public class StrongTrial extends Trial{
    private static int timeLimited;
    private int passingTime;
    StrongTrial(){}
    StrongTrial(String surname){
        super(surname);
    }
    StrongTrial(String surname, int scoreOne, int scoreTwo, int passingTime){
        super(surname, scoreOne, scoreTwo);
        this.passingTime = passingTime;
    }
    public String toString(){
        return super.toString() + ";" + passingTime;
    }
    public boolean isPassed(){
        return super.isPassed() && (passingTime <= timeLimited);
    }

    public static int getTimeLimited() {
        return timeLimited;
    }

    public static void setTimeLimited(int timeLimited) {
        StrongTrial.timeLimited = timeLimited;
    }

    public int getPassingTime() {
        return passingTime;
    }

    public void setPassingTime(int passingTime) {
        this.passingTime = passingTime;
    }
}
