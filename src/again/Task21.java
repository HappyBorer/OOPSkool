package again;

import java.util.Scanner;

/*
Напишите статический метод printTriangle(), который выводит на консоль треугольник, показанный в примерах тестов.
Параметрами метода являются ширина основания и символ, которым рисуется треугольник.
В конце каждой строки нет невидимых пробелов, курсор переводится сразу после последнего символа.
Также напишите метод main(), в котором вводятся с консоли ширина треугольника и символ, а затем
вызывается метод printTriangle().
Совет. В классе Scanner нет метода для ввода отдельного символа. Можно ввести данные как строку, а потом
взять первый символ этой строки:
String str = scan.next();
char sim = str.charAt(0);
Тестовые данные
Sample Input 1:
7 #
Sample Output 1:
   #
  ###
 #####
#######
Sample Input 2:
4 $
Sample Output 2:
 $$
$$$$
 */
public class Task21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int width = input.nextInt();
        char symbol = input.next().charAt(0);
        printTriangle(width, symbol);
    }

    static void printTriangle(int width, char symbol) {
        for (int j = width % 2 == 0 ? 2 : 1; j <= width; j += 2) {
            for (int i = 0; i < (width-j)/2 ; i++) {
                System.out.print(" ");
            }
            for (int l = width - j; l < width; l++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
