package again;

import java.util.Scanner;

/*
Ввести строку из слов, разделенных пробелами. Между словами может быть любое количество пробелов. Также
пробелы могут быть перед первым и после последнего слова.
Найти и распечатать первое слово максимальной длины.
Тестовые данные
Sample Input:
   Свиристелки прилетели     и    запели в унисон
Sample Output:
Свиристелки
 */
public class Task30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine().trim();
        String[] array = str.split(" +");
        int imax = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[imax].length() < array[i].length()){
                imax = i;
            }
        }
        System.out.println(array[imax]);
    }
}
