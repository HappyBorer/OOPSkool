package again;

import java.util.Scanner;

/*
Напишите статический метод maxNumberDivider(), который в заданном диапазоне находит число с
наибольшим количеством делителей.
Метод main() менять нельзя!
Совет: сделайте отдельный  метод, который подсчитывает количество делителей числа, а затем вызывайте
его в методе maxNumberDivider().
Тестовые данные
Sample Input:
530 545
Sample Output:
540
 */
public class Task20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int max = maxNumberDivider(a, b);
        System.out.println(max);
    }
    static int maxNumberDivider(int numberOne, int numberTwo){
        if(numberOne > numberTwo){
            int temp = numberOne;
            numberOne = numberTwo;
            numberTwo = temp;
        }
        int maxDivider = numberDivider(numberOne);
        int max;
        int number = numberOne;
        while(++numberOne <= numberTwo){
            max = numberDivider(numberOne);
            if(maxDivider < max){
                maxDivider = max;
                number = numberOne;
            }
        }
        return number;
    }
    static int numberDivider(int number){
        int divider = 0;
        for (int i = 1; i <= number; i++) {
            if(number%i == 0){
                divider++;
            }
        }
        return divider;
    }
}
