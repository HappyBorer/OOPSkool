package OOP.Task1;

public class Abiturient {
    private String name;
    private String surname;
    private int math, physics, lang;
    Abiturient(){

    }
    Abiturient(String surname , String name){
        this.name = name;
        this.surname = surname;
    }
    Abiturient(String surname, String name, int math, int physics, int lang){
        this.name = name;
        this.surname = surname;
        this.math = math;
        this.physics = physics;
        this.lang = lang;
    }
    public double average(){
        return (math + physics + lang)/3.;
    }
    public void print(){
        System.out.printf("%s %s математика = %d физика = %d язык = %d средний балл = %.1f", surname, name,
                math, physics, lang, average());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getPhysics() {
        return physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public int getLang() {
        return lang;
    }

    public void setLang(int lang) {
        this.lang = lang;
    }
}
