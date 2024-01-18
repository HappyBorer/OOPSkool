package again;

import java.util.Scanner;
/*
Напишите статический метод simpleInRange(), который подсчитывает количество простых чисел в заданном диапазоне.
Если границы диапазона введены неверно (первое число больше второго), то в методе нужно их переставить местами.
В методе main продемонстрировано использование  simpleInRange() (этот код менять нельзя!)
P. S. Используйте метод isSimple(), уже реализованный в предыдущем задании!
Тестовые данные
Sample Input 1:
1 10
Sample Output 1:
4
Sample Input 2:
20 5
Sample Output 2:
6
 */
public class Task18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int kol = simpleInRange(a, b);
        System.out.println(kol);
    }
    static boolean isSimple(int number){
        if(number <= 0 || number == 1){
            return false;
        }
        for (int i = 2; i < number; i++) {
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    static int simpleInRange(int numberOne, int numberTwo){
        if(numberOne > numberTwo){
            int temp = numberOne;
            numberOne = numberTwo;
            numberTwo = temp;
        }
        int counter = 0;
        while(numberOne <= numberTwo){
            if(isSimple(numberOne)){
                counter++;
            }
            numberOne++;
        }
        return counter;
    }
}
