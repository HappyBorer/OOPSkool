package again;

import java.util.Scanner;

/*
Напишите две перегрузки статического  метода square() для вычисления площади прямоугольника. В одном случае в метод
передаются две стороны прямоугольника, а в другом - одна сторона квадрата (все - вещественные числа).
В методе main() вводится сначала целое число:
1 означает, что нужно вычислить площадь квадрата. И затем следует ввод одного вещественного числа (стороны квадрата)
2 означает, что нужно вычислить площадь прямоугольника. Затем следует ввод двух сторон прямоугольника.
Выводимую площадь нужно представить с двумя знаками после десятичной точки.
Тестовые данные
Sample Input 1:
2 4.4 3.2
Sample Output 1:
14.08
Sample Input 2:
1 5.5
Sample Output 2:
30.25
 */
public class Task22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number == 1){
            double a = input.nextDouble();
            System.out.printf("%.2f\n",square(a));
        } else if (number == 2) {
            double a = input.nextDouble();
            double b = input.nextDouble();
            System.out.printf("%.2f\n", square(a, b));
        }
    }
    static double square(double side){
        return side * side;
    }
    static double square(double sideOne, double sideTwo){
        return sideOne * sideTwo;
    }
}
