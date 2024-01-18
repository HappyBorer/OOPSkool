package again;

import java.util.Scanner;

/*
    На вход программы подается размер интервала времени в секундах. Переведите это в часы, минуты и секунды
    и выведите согласно примеру теста.

    Тестовые данные
    Sample Input:

    20367
    Sample Output:

    5 часов 39 минут 27 секунд
 */
public class Example2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = input.nextInt();
        input.close();
        int hour = total / 3600;
        total %= 3600;
        int minute = total / 60;
        int second = total % 60;
        System.out.println(hour + " часов " + minute + " минут " + second + " секунд");

    }
}
