package again;

import java.util.Scanner;

/*
Пользователь вводит три строки, которые содержат части кодового слова. Каждая вводимая строка может содержать
пробелы и заканчивается символом перехода на новую строку ('\n').
Части кодового слова выделены внутри строки знаками ';'. Нужно соединить эти части в одну строку и вывести эту
строку на консоль.
Замечание: поскольку предполагается, что кодовое слово будет как-то использовано в дальнейшем, недостаточно
его просто вывести на консоль по частям. Нужно именно сформировать его в виде одной строки, а затем уже выводить!
Тестовые данные
Sample Input:
To be or ;not; to be?
tes;ting; is good
I like ;ham; more then eggs
Sample Output:
nottingham
 */
public class Task27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = "";
        for (int i = 0; i < 3; i++) {
            String str = input.nextLine();
            int begin = str.indexOf(';') + 1;
            int end = str.lastIndexOf(';');
            password += str.substring(begin, end);
        }
        System.out.println(password);
    }
}
