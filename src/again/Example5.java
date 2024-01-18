package again;

import java.util.Scanner;

/*
Ввести значение вещественного аргумента a и вычислить значения двух функций:
z=2sin^2(3π−2a)cos^2(5π+2a)
y = 1/4−1/4sin(5/2π−8a)
Вывести на консоль сначала z, а потом y, разделив их пробелом. Значения представить с пятью знаками после десятичной точки.
Тестовые данные
Sample Input:
4.78
Sample Output:
0.03569 0.03569
 */
public class Example5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        input.close();
        double z, y;
        z = 2 * Math.pow(Math.sin(3*Math.PI - 2*a), 2) * Math.pow(Math.cos(5 * Math.PI + 2 * a), 2);
        y = (1/4.) - (1/4.)*Math.sin((5/2.) * Math.PI - 8 * a);
        System.out.printf("%.5f %.5f", z, y);
    }
}
