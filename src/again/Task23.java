package again;

import java.util.Scanner;

/*
Напишите четыре перегрузки статического метода average(), который находит среднее арифметическое
двух вещественных чисел;
трех вещественных чисел;
двух целых чисел
трех целых чисел
В методе main() показано использование методов average() - его менять нельзя!
Подумайте, можно ли сократить число перегрузок? Если да, то какие методы можно удалить?
Тестовые данные
Sample Input:
3 4 8
7.2 0.3 4.8
Sample Output:
3.50 5.00
3.75 4.10
 */
public class Task23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double z = scan.nextDouble();
        System.out.printf("%.2f %.2f\n", average(a, b), average(a, b, c));
        System.out.printf("%.2f %.2f\n", average(x, y),average(x, y, z));
    }
    static double average (int a, int b){
        return (a + b)/2.;
    }
    static double average (int a, int b, int c){
        return (a + b + c)/3.;
    }
    static double average (double x, double y){
        return (x + y)/2;
    }
    static double average (double x, double y, double z){
        return (x + y + z)/3;
    }
}
