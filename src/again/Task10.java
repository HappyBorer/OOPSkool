package again;

import java.util.Scanner;

/*
Программа должна определить зарплату служащего компании. Пользователь вводит количество отработанных часов (целое)
и почасовой тариф (вещественное). Компания платит обычный тариф за первые 20 часов (включительно),  полуторный тариф
за время, отработанное от 20 (не включая) до 40 часов (включительно), и двойной тариф за время свыше 40 часов.
Например, если служащий отработал 42 часа, а почасовой тариф 10.5 рублей, то он получит
20*10.5=210 рублей за первые 20 часов;
20*10.5*1.5=315 рублей за вторые 20 часов;
2*10.5*2=42 рубля за последние 2 часа.
Итого 210+315+42=567 рублей.
Вывести зарплату служащего, округлив ее до двух знаков после десятичной точки. Если введено отрицательное значение
количества часов или отрицательный тариф, вывести ERROR.
Тестовые данные
Sample Input:
42 10.5
Sample Output:
567.00
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hour = input.nextInt();
        double tariff = input.nextDouble();
        if (tariff < 0 || hour < 0) {
            System.out.println("ERROR");
            return;
        }
        input.close();
        double salary = 0;
        if(hour > 40){
            salary += (hour - 40) * tariff * 2.0;
            hour -= (hour - 40);
        }
        if(hour > 20){
            salary += (hour - 20) * tariff * 1.5;
            hour -= (hour - 20);
        }
        if(hour < 21){
            salary += hour * tariff;
        }
        System.out.printf("%.2f", salary);
    }
}
