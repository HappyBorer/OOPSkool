package again;

import java.util.Scanner;

/*
Напишите статический  метод printDivider(), который выводит все делители натурального числа
через пробел (включая единицу и само число). Метод не возвращает никакого значения!
Пример использования этого метода в main() менять нельзя!
Тестовые данные
Sample Input:
246
Sample Output:
1 2 3 6 41 82 123 246
 */
public class Task19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        printDivider(number);
    }
    static void printDivider(int number){
        for (int i = 1; i < number; i++) {
            if(number%i == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println(number);
    }
}
