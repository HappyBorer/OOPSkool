package OOP.Task1.Pats;

public class Dog extends Pat{
    private String breed;

    public Dog(){}

    public Dog(String nickname, int age , String breed){
        super(nickname, age);
        this.breed = breed;
    }

    @Override
    public String toString(){
        return super.toString() + ";" + breed;
    }

    @Override
    public void getNoise() {
        System.out.println( "Гав-гав!");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
