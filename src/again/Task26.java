package again;

import java.util.Scanner;

/*
Введите строку (в ней возможны пробелы). Замените в ней каждый символ «;»   на пару символов «.,»
Тестовые данные
Sample Input:
hello;; by!; ;;
Sample Output:
hello.,., by!., .,.,
 */
public class Task26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        input.close();
        str = str.replace(";", ".,");
        System.out.println(str);
    }
}
