package again;

import java.util.Arrays;
import java.util.Scanner;

/*
Введите строку, состоящую из слов, отделенных ровно одним пробелом.
Замените первую букву каждого слова на прописную. Выведите полученную строку.
Тестовые данные
Sample Input:

one apple a day keeps a doctor away
Sample Output:

One Apple A Day Keeps A Doctor Away
 */
public class Task32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] array = input.nextLine().trim().split(" ");
        String str = "";
        for(int i = 0;i < array.length; i++){
            char[] word =  array[i].toCharArray();
            word[0] = array[i].toUpperCase().charAt(0);
            array[i] = "";
            for (int j = 0; j < word.length; j++) {
                array[i] += word[j];
            }
            str += array[i] + " ";

        }
        System.out.println(str.trim());
    }
}
