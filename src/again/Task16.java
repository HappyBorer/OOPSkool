package again;

import java.util.Scanner;

/*
Пользователь вводит границы диапазона целых чисел. Границы диапазона в тестах корректны (не нужно проверять,
что первая граница меньше или равна второй).
Нужно найти сумму наименьших делителей всех чисел в этом диапазоне (рассматриваются делители, начиная с 2).
Например, для диапазона 8 ...11:
наименьший делитель 8 равен 2
наименьший делитель 9 равен 3
наименьший делитель 10 равен 2
наименьший делитель 11 равен 11
Сумма  2+3+2+11=18
Тестовые данные
Sample Input:
8 11
Sample Output:
18
 */
public class Task16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int left = input.nextInt();
        int right = input.nextInt();
        input.close();
        int sumDivider = 0;
        while(left <= right){
            for (int i = 2; i <= left ; i++) {
                if(left % i == 0){
                    sumDivider += i;
                    break;
                }
            }
            left++;
        }
        System.out.println(sumDivider);
    }
}
