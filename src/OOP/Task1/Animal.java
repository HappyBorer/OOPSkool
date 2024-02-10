package OOP.Task1;

public class Animal {
    String typeOfAnimal;
    private String name;
    int age;
    double weight;
    boolean isWalk;
    boolean isSwim;
    boolean isFly;
    Animal(String typeOfAnimal, String name){
        this.typeOfAnimal = typeOfAnimal;
        this.name = name;
    }
    Animal(String typeOfAnimal, int age){
        this.typeOfAnimal = typeOfAnimal;
        this.age = age;
        name = "No Name";
    }

    public void info(){
        System.out.printf("Type of animal: %s,\n name: %s, age: %d,\n weight: %.1f,\n walk: %s, \nswim: %s, \nfly: %s.\n",
                typeOfAnimal, name, age, weight, isWalk? "YES":"NO", isSwim? "YES":"NO", isFly? "YES":"NO");
    }

    public void setName(String name){
        this.name = name;
    }
     public void changingTheMass(){
        weight += 0.1;
     }

}
