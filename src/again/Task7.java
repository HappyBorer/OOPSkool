package again;

import java.util.Scanner;

/*
Пользователь вводит целое трехзначное число. Вывести сумму его нечетных цифр.
Если число не является трехзначным, вывести "ERROR".
Если нечетных цифр нет, то вывести "NO".
Тестовые данные
Sample Input 1:
367
Sample Output 1:
10
Sample Input 2:
-351
Sample Output 2:
9
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Math.abs(input.nextInt());
        input.close();
        if(number < 100 || number > 999){
            System.out.println("ERROR");
            return;
        }
        int sum = 0;
        if((number % 10) % 2 != 0){
            sum += number%10;
        }
        if((number / 10 % 10) % 2 != 0){
            sum += number/ 10 % 10;
        }
        if((number / 100) % 2 != 0){
            sum += number/100;
        }
        if(sum == 0){
            System.out.println("NO");
        }else{
            System.out.println(sum);
        }

    }
}
