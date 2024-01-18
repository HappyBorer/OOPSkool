package again;

import java.util.Scanner;

/*
Найти минимальное из пяти целых чисел, введенных пользователем.
Тестовые данные
Sample Input:
3 -2 5 0 1
Sample Output:
-2
 */
public class Task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int oneNumber = input.nextInt();
        int twoNumber = input.nextInt();
        int threeNumber = input.nextInt();
        int fourNumber = input.nextInt();
        int fiveNumber = input.nextInt();
        int max = Math.min(oneNumber, twoNumber);
        if(max > threeNumber){
            max = threeNumber;
        }
        if(max > fourNumber){
            max = fourNumber;
        }
        max = max > fiveNumber ? fiveNumber : max;
        System.out.println(max);

    }
}
