package again;

import java.util.Scanner;

/*
Вычислите стоимость товара с учетом скидки. Пользователь вводит цену товара в виде двух целых чисел через пробел
(рубли копейки). В следующей строке он вводит размер скидки в процентах (также целое число). Цену нужно вывести так,
как показано в тесте.
Учтите, что здесь не применяется округление по правилам математики. Стоимость товара всегда учитывается в большую сторону.
При выводе число рублей и копеек выводится в двух позициях (т.е. 00 коп., если копеек нет)
Тестовые данные
Sample Input 1:
57 86
15
Sample Output 1:
49 руб. 19 коп.
Sample Input 2:
67 50
20
Sample Output 2:
54 руб. 00 коп.
 */
public class Example3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rub = input.nextInt();
        int cop = input.nextInt();
        int discount = input.nextInt();
        input.close();
        int price = rub * 100 + cop;
        int priceDiscount = price * discount / 100;
        int result = price - priceDiscount;
        rub = result / 100;
        cop = result % 100;
        System.out.printf("%02d руб. %02d коп.", rub, cop);
    }
}
