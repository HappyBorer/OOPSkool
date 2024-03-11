package OOP.Task1;

public class Trial {
    private static int passingScore;
    private String surname;
    private int scoreOne, scoreTwo;

    Trial(){
    }
    Trial(String surname){
        this.surname = surname;
    }
    Trial(String surname, int scoreOne, int scoreTwo){
        this.surname = surname;
        this.scoreOne = scoreOne;
        this.scoreTwo = scoreTwo;
    }
    public boolean isPassed(){
        return scoreOne >= passingScore && scoreTwo >= passingScore;
    }

    @Override
    public String toString() {
        return String.format("%s;%d;%d", surname, scoreOne, scoreTwo);
    }

    public static int getPassingScore() {
        return passingScore;
    }

    public static void setPassingScore(int passingScore) {
        Trial.passingScore = passingScore;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getScoreOne() {
        return scoreOne;
    }

    public void setScoreOne(int scoreOne) {
        this.scoreOne = scoreOne;
    }

    public int getScoreTwo() {
        return scoreTwo;
    }

    public void setScoreTwo(int scoreTwo) {
        this.scoreTwo = scoreTwo;
    }
}
