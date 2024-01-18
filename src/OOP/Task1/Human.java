package OOP.Task1;

public class Human {
    private static final int minAge = 17;
    private  static final int maxAge = 101;
    private static final int minHeight = 119;
    private static final int maxHeight = 221;
    private static final int minWeight = 29;
    private static final int maxWeight = 301;
    private String familyName;
    private String name;
    private String surname;
    private int age;
    private int height, weight;

    Human(){
        this.age = 18;
        this.height = 180;
    }
    Human(String familyName, String name, String surname, int age, int height, int weight){
        if(isUpper(familyName)){
            this.familyName = familyName;
        }
        if(isUpper(name)){
            this.name = name;
        }
        if(isUpper(surname)){
            this.surname = surname;
        }
        if(isAge(age)){
            this.age = age;
        }
        if(isHeight(height)){
            this.height = height;
        }
        if(isWeight(weight)){
            this.weight = weight;
        }
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        if(isUpper(familyName)){
            this.familyName = familyName;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(isUpper(name)){
            this.name = name;
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if(isUpper(surname)){
            this.surname = surname;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(isAge(age)){
            this.age = age;
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if(isHeight(height)){
            this.height = height;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if(isWeight(weight)){
            this.weight = weight;
        }
    }

    private boolean isUpper(String str){
        for (int i = 0; i < str.length(); i++) {
            if(!Character.isLetter(str.charAt(i))){
                return false;
            }
        }
        return str.charAt(0) == str.toUpperCase().charAt(0);
    }
    private boolean isAge(int age){
        return age > minAge && age < maxAge;
    }
    private boolean isHeight(int height){
        return height > minHeight && height < maxHeight;
    }
    private boolean isWeight(int weight){
        return weight > minWeight && weight < maxWeight;
    }

    public void info(){
        System.out.printf("Family name: %s\nName: %s\nSurname: %s\nAge: %d\nHeight: %d\nWeight: %d\n", familyName,
                name, surname, age, height, weight);
    }
    public int bodyMassIndex(){
        return (int)(weight/(Math.pow(height,2)/10000));
    }
}
