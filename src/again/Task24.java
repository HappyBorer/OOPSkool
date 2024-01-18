package again;

import java.util.Random;
import java.util.Scanner;

/*
Массив из целых чисел заполнить случайными значениями от -5 до 5 (включая обе границы) Пользователь вводит размер
массива, а затем начальное значение генератора случайных чисел.
Вывести исходный массив на консоль в одной строке, разделяя элементы пробелами. Пробел должен быть в том числе
и после последнего элемента массива.
Найти сумму положительных элементов массива и произведение отрицательных элементов. Произведение быстро растет,
поэтому оно должно иметь тип double.
C новой строки вывести результаты программы через пробел (сначала сумму, а потом произведение).
Тестовые данные
Sample Input:
10 7
Sample Output:
-3 5 5 -3 1 -1 0 2 5 5
23 -9.0
 */
public class Task24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int beginRan = input.nextInt();
        int[] array = new int[size];
        Random rand = new Random(beginRan);
        for (int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(-5, 6);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int sumPositive = 0;
        double mulNegative = 1;
        for (int element : array) {
            if(element >= 0){
                sumPositive += element;
            }else{
                mulNegative *= element;
            }
        }
        System.out.println(sumPositive + " " + mulNegative);
    }
}
