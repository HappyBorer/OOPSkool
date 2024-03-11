package OOP.Task1;

public class LightTrial extends  Trial{
    LightTrial(){}
    LightTrial(String surname){
        super(surname);
    }
    LightTrial(String surname, int scoreOne, int scoreTwo){
        super(surname, scoreOne, scoreTwo);
    }
    public boolean isPassed(){
        return (getScoreOne() + getScoreTwo()) >= getPassingScore();
    }
}
