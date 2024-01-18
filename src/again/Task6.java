package again;

import java.util.Scanner;

/*
Пользователь вводит координаты двух точек на плоскости (в первой строке через пробел - координата X и
координата Y первой точки, затем во второй строке также через пробел координаты второй точки). Нужно определить,
какая из точек ближе к началу координат.
Выводится одно из сообщений: "Первая точка ближе", "Вторая точка ближе", "Точки на равных расстояниях".
Подсказка: расстояние до начала координат находится по формуле: d= sqrt(x^2 + y^2);
Тестовые данные
Sample Input 1:
3.5 -1.5
2 4.8
Sample Output 1:
Первая точка ближе
Sample Input 2:
2.2 -4.1
4.1 2.2
Sample Output 2:
Точки на равных расстояниях
 */
public class Task6 {
    public static void main(String[] args) {
        double x, y, x1, y1;
        Scanner input = new Scanner(System.in);
        x = input.nextDouble();
        y = input.nextDouble();
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        double pointOne = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        double pointTwo = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
        if(pointOne < pointTwo){
            System.out.println("Первая точка ближе");
        }else if(pointOne > pointTwo){
            System.out.println("Вторая точка ближе");
        }else{
            System.out.println("Точки на равных расстояниях");
        }
    }
}
