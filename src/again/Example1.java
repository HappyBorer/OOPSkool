package again;

import java.util.Scanner;

/*
В отделе работают 3 сотрудника, которые получают заработную плату в рублях. Требуется определить, на сколько
зарплата самого высокооплачиваемого из них отличается от самого низкооплачиваемого. Пользователь вводит три
целых числа (три зарплаты в рублях). Программа выводит разность зарплат в рублях.

Используйте тернарную операцию!

Тестовые данные
Sample Input:

6000 12000 10500
Sample Output:

6000
 */
public class Example1 {
    public static void main(String[] args) {
        String[] str = "10+10".split("[^/*\\-+]");
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        System.out.println(str.length);

    }
}