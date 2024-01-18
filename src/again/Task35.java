package again;

import java.util.Scanner;

/*
Напишите метод primer(), который принимает два целых числа и возвращает строку, представляющую собой пример
на сложение (см. тест). Используйте для формирования результата StringBuilder!
Исходный код метода main менять нельзя!
Тестовые данные
Sample Input:
8 11
Sample Output:
8 + 11 = 19
 */
public class Task35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        String str = primer(a, b);
        System.out.println(str);
    }

    static String primer(int numberOne, int numberTwo){
        StringBuilder example = new StringBuilder();
        example.append(numberOne).append(" + ").append(numberTwo).append(" = ").append(numberOne + numberTwo);
        return example.toString();
    }
}
