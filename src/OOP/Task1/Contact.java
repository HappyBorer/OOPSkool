package OOP.Task1;

public class Contact {
    StringBuilder name, number;
    Contact(String name, String number){
        this.name = new StringBuilder(name);
        this.number = new StringBuilder(number);
    }
    public void info(){
        char symbol = Character.toUpperCase(name.charAt(0));
        name.setCharAt(0, symbol);
        if(!(number.charAt(0) == '+')){
            number.insert(0, '+');
        }
        System.out.println(name);
        System.out.println(number);
    }
}
