package again;

import java.util.Scanner;

/*
Напишите статический метод isSimple(), который возвращает true, если аргумент является простым числом,
и false - в противном случае.
Простым называется целое положительное число, которое не имеет других делителей, кроме единицы и себя самого.
Отрицательные числа не могут быть простыми (поэтому функция должна возвращать false). Простыми также не являются
числа 0 и 1.
В методе main продемонстрировано использование метода isSimple(). Этот код менять нельзя!
Тестовые данные
Sample Input:
1 13 23 67 10
Sample Output:
false true true true false
 */
public class Task17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int number = scan.nextInt();
            System.out.print(isSimple(number) + " ");
        }
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
}
