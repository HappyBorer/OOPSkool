package again;

import java.util.Scanner;

/*
Напишите статический метод, который проверяет, есть ли в конце строки подстрока ".com". Если да, то он
возвращает часть строки без этого фрагмента. Если нет, то он возвращает строку без изменения.
Тестовые данные
Sample Input 1:
intel.com.think.com
Sample Output 1:
intel.com.think
Sample Input 2:
stepik.org
Sample Output 2:
stepik.org
 */
public class Task29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(delCom(str));
    }
    static String delCom(String str){
        String del = ".com";
        if(str.lastIndexOf(del) != -1 && (str.length() - del.length()) == str.lastIndexOf(del)){
            str = str.substring(0, str.lastIndexOf(del));
        }
        return str;
    }
}
