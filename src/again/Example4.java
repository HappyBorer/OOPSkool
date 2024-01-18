package again;

import java.util.Scanner;

/*
Напишите программу, которая вычисляет значение функции
f(x) = lg(x + 7 * №x^4 + pi)

При выводе значение функции представьте с четырьмя знаками после десятичной точки.

Тестовые данные
Sample Input:

3.45
Sample Output:

4.4738
 */
public class Example4 {
    public static void main(String[] args) {
        double x;
        Scanner input = new Scanner(System.in);
        x = input.nextDouble();
        double result = Math.log(x + 7 * Math.sqrt(Math.pow(x, 4) + Math.PI));
        System.out.printf("%.4f", result);
    }
}
