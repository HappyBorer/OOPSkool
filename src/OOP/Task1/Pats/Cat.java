package OOP.Task1.Pats;

public class Cat extends Pat{
    private String color;
    public Cat(){}
    public Cat(String nickname, int age, String color){
        super(nickname, age);
        this.color = color;
    }
    @Override
    public String toString(){
        return super.toString() + ";" + color;
    }
    @Override
    public void getNoise() {
        System.out.println("Мяу-мяу!");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
