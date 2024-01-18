package again;

import java.util.Scanner;

/*
Ввести текст из слов, разделенных пробелами. Между словами может быть любое количество пробелов. Также пробелы могут
быть перед первым и после последнего слова.
Также ввести контрольное слово.
Удалить из текста все появления данного слова (но не как части другого слова!)
Также удалить все лишние пробелы между словами и в начале и в конце строки.
Тестовые данные
Sample Input:
A good    dog deserves a    good bone or goodness
good
Sample Output:
A dog deserves a bone or goodness
 */
public class Task31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "";
        String[] array = input.nextLine().trim().split(" +");
        String line = input.nextLine();
        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(line)){
                array[i] = "";
            }
            if(i != array.length - 1 && !array[i].isEmpty()){
                str += array[i] + " ";
            }else {
                str += array[i];
            }
        }
        System.out.println(str);
    }
}
