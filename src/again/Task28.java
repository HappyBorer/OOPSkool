package again;

import java.util.Scanner;

/*
Напишите метод, который проверяет, что строка является адресом почты gmail.com (т.е. в конце строки
"@gmail.com", и знак @ только один).
Метод main()  менять нельзя!
Тестовые данные
Sample Input 1:
petr.ivanov@gmail.com
Sample Output :
YES
Sample Input 2:
ivanov@petr@gmail.com
Sample Output 2:
NO
 */
public class Task28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if (isGMailAddress(str)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    static boolean isGMailAddress(String str){
        if(str.length() < 11){
            return false;
        }
        return str.indexOf("@") == str.lastIndexOf("@") && str.substring(str.indexOf("@")).equals("@gmail.com");
    }
}
