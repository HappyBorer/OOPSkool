package again;

import java.util.Scanner;

/*
Напишите программу- переводчик. Пользователь вводит название дня недели на русском языке, а программа выводит
это название на английском. При этом на русском можно вводить название как с большой буквы, так и с маленькой.
А на английском день недели - имя собственное, поэтому выводится с большой буквы.
Если  название дня недели введено неверно, то программа выводит "ERROR".
Используйте оператор switch.
Тестовые данные
Sample Input 1:
Понедельник
Sample Output 1:
Monday
Sample Input 2:
понедельник
Sample Output 2:
Monday
Напишите программу. Тестируется через stdin → st
 */
public class Task12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String dayWeek = input.next();
        input.close();
        switch(dayWeek){
            case "понедельник":
            case "Понедельник":
                System.out.println("Monday");
                break;
            case "вторник":
            case "Вторник":
                System.out.println("Tuesday");
                break;
            case "среда":
            case "Среда":
                System.out.println("Wednesday");
                break;
            case "четверг":
            case "Четверг":
                System.out.println("Thursday");
                break;
            case "пятница":
            case "Пятница":
                System.out.println("Friday");
                break;
            case "суббота":
            case "Суббота":
                System.out.println("Saturday");
                break;
            case "воскресенье":
            case "Воскресенье":
                System.out.println("Sunday");
                break;
            default:
                System.out.println("ERROR");
        }
    }
}
