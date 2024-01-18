package again;

import java.util.Scanner;

/*
Пользователь вводит целое неотрицательное число. Найти сумму его четных делителей (не включая его самого).
Тестовые данные
Sample Input 1:
16
Sample Output 1:
14
Sample Input 2:
15
Sample Output 2:
0
 */
public class Task15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();
        int sum = 0;
        for (int i = 2; i < number; i++) {
            if(number % i == 0 && i % 2 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
